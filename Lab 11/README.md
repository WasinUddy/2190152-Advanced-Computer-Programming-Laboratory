---

### Objective:
Create an HTML page with a form that allows users to input a number 'n'. Upon submitting the form, use JavaScript to fetch data from the REST Countries API, calculate the total population of the first 'n' countries returned from the API, and display the results in a bar chart using Chart.js.

### Instructions:

#### 1. Set up the HTML file (`index.html`):
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Country Population Bar Chart</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <h1>Country Population Bar Chart</h1>
    <form id="populationForm">
        <label for="numberOfCountries">Enter the number of countries (n):</label>
        <input type="number" id="numberOfCountries" required>
        <button type="button" onclick="generateChart()">Generate Chart</button>
    </form>
    <canvas id="barChart" width="600" height="400"></canvas>
    <script src="script.js"></script>
</body>
</html>
```

#### 2. Create the JavaScript file (`script.js`):

Fetch data from `https://restcountries.com/v3.1/all` and display the first `n` countries returned from the API. The `n` comes from the `numberOfCountries` input.

```javascript
async function generateChart() {
  // Write your code here. You can write your own function(s) if you want.




};
```
#### 3. Expected Output


#### 4. Submission

Submit the script.js file to MyCourseVille.