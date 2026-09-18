Created calculator that takes arrays as input int[] containing prices in whole cents and returns total as a long. 
Prices use whole cents to avoid decimal rounding issues.
It returns a total as a long as combined subtotal can exceed maximum value an int can hold.
The calculator throws IllegalArgumentException whenever there's negative price or null array is supplied. Zero priced items are still allowed, an empty array will return zero.
All the test cases can be run using: mvn clean test from the project folder containing pom.xml
All the test cases and test approach can be found under: sdet-001-cart-subtotal/SDET-001.xlsx
All the test log can be found under hsbansal/sdet-001-cart-subtotal/baseline-pass.txt, deliberate-failure.txt & restored-pass.txt
The debugging explanation is in Debugging Report.docx in the repository root.
