package esrome.mcchoc.capabilities.unique.candleHolder;

public class CandleHolder implements ICandleHolder {

	public float candle;
	
	@Override
	public float getCandle() {
		return candle;
	}

	@Override
	public void setCandle(float type) {
		candle = type;
	}

}
