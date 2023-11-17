async function generateChart() {
    // Destroy previous chart
    if (window.chart) {
        window.chart.destroy();
    }
    
    // Fetch data from API at https://restcountries.com/v3.1/all return as Promise to variable response
    const response = await fetch('https://restcountries.com/v3.1/all'); 
    
    // Check Validity of response
    let responseData;
    if (!response.ok) {
        console.error(response.status);
    }else{
        responseData = await response.json(); // Convert response to JSON
    }

    // Slice data according to user input
    if (responseData) {     
        const numberOfCountries = parseInt(document.getElementById("numberOfCountries").value);
        responseData = responseData.slice(0, numberOfCountries);
    }
    
    // Construct Plotting data structure
    const plotData = {
        labels: responseData.map(country => country.name.common),
        datasets: [{
            label: 'Total Population',
            data: responseData.map(country => country.population),
            backgroundColor: 'rgb(221, 242, 242)',
            borderColor: 'rgb(169, 222, 222)',
            borderWidth: 1
        }]
    }

    // Set Plotting Configuration
    const plotConfig = {
        type: 'bar',
        data: plotData,
        options: {
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    };
    
    // Plot the chart
    window.chart = new Chart(document.getElementById('barChart'), plotConfig)  
};