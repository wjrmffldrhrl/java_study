public class AdapterImpl implements Adapter{

    @Override
    public Float twiceOf(Float f) {
        // TODO Auto-generated method stub
        return (float) AleadyMath.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        // TODO Auto-generated method stub
        return (float) AleadyMath.half(f.doubleValue());
    }
    
}
