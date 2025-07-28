class Variable{

    int instanceVar = 10;

    public void display() {
        int localVar = 5;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        Variable obj = new Variable();

        obj.display();
    }
}
