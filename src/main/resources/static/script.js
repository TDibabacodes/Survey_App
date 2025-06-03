// Validation for fullName: only letters and spaces allowed
document.getElementById("fullName").addEventListener("input", function () {
  this.value = this.value.replace(/[^a-zA-Z\s]/g, "");
});

// Validation for contact: only digits allowed, max 10 digits with alert if exceeded
document.getElementById("contact").addEventListener("input", function () {
  this.value = this.value.replace(/\D/g, ""); // Remove non-digits
  if (this.value.length > 10) {
    alert("Contact number cannot be more than 10 digits.");
    this.value = this.value.slice(0, 10);
  }
});

// Form submission event
document.getElementById("surveyForm").addEventListener("submit", function (event) {
  event.preventDefault(); // Prevent form from reloading the page

  // Collect form data into an object
  const formData = {
    fullName: document.getElementById("fullName").value.trim(),
    contact: document.getElementById("contact").value.trim(),
    age: document.getElementById("age").value.trim(),
    date: document.getElementById("date").value,

    // Collect checked checkboxes
    food: Array.from(document.querySelectorAll("input[name='food']:checked")).map(cb => cb.value),

    // Collect selected radio buttons
    eatOut: document.querySelector("input[name='eatOut']:checked")?.value,
    movies: document.querySelector("input[name='movies']:checked")?.value,
    tv: document.querySelector("input[name='tv']:checked")?.value,
    radio: document.querySelector("input[name='radio']:checked")?.value
  };

  // Convert formData to formatted JSON string
  const jsonData = JSON.stringify(formData, null, 2); // `null, 2` makes it readable

  // Show the JSON in an alert popup
  alert("Survey Data:\n\n" + jsonData);
});
