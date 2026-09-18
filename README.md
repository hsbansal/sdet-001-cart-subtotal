<h1 align = "center"> Cart Price Calculator</h1>

<dl>
  <dt>Working Setup</dt>
    <dd>JDK 25, Maven 3.9.9, and TestNG 7.12.0</dd>
  <dt>SubtotalCalculator Method</dt>
    <dd>Created calculator that takes arrays as input int[] containing prices in whole cents and returns total as a long.</dd>
    <dd>Prices use whole cents to avoid decimal rounding issues.</dd>
    <dd>It returns a total as a long as combined subtotal can exceed maximum value an int can hold.</dd>
  <dd>The calculator throws IllegalArgumentException whenever there's negative price or null array is supplied. Zero priced items are still allowed, an empty array will return zero.</li><br>
  <dt>Test Cases</dt>
    <dd>All the test cases can be run using: mvn clean test from the project folder containing pom.xml</dd?>
    <dd>All the test cases and test approach can be found under: sdet-001-cart-subtotal/SDET-001.xlsx</dd>
    <dd>All the test log can be found under hsbansal/sdet-001-cart-subtotal/baseline-pass.txt, deliberate-failure.txt & restored-pass.txt.</dd>
  <dt>Debugging report</dt>
    <dd>The debugging explanation is in Debugging Report.docx in the repository root.</dd>
</dl>
