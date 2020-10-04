class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a2 = new A2();

        a2.autoPlay(new B2());
        a2.autoPlay(new C2());
    }
}

class A2 {
    void autoPlay(I i) {
        i.play();
    }
}

class B2 implements I {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play in B");
    }
   
}

class C2 implements I {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play in C");
    }
    

    
}

interface I {
    void play();
}