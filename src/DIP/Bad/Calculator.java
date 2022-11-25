package DIP.Bad;

public class Calculator {
    public int calculate(int a, int b , String type){
        int res = 0;
        switch (type) {
            case "add" :
                AddOperation addOperation = new AddOperation();
                res = addOperation.add(a, b);
                break;
            case "sub" :
                SubOperation subOperation = new SubOperation();
                res = subOperation.sub(a, b);
                break;
        }
        return res;
    }
}
