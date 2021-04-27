package CS246.mandiBeauchaine;

public class Calculator {
    private float results;

    public Calculator() {
        results = 0.0f;
    }
        public void add(float value) {
            results += value;
        }
        public void subtract(float value) {
            results -= value;
        }
        public void multiply(float value){
            results *= value;
        }
        public void divide(float value) {
            /*check for divide by zero*/
            if (value == 0.0f) {
                results = 0.0f;
            } else {
                results /= value;
            }
        }
        public void reset(){
        results = 0.0f;
            }
    public float getResults() {
        return results;
    }


}



