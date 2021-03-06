package org.shoushitsu.waveprint.spectrogram;

/**
 * @author Yanus Poluektovich (ypoluektovich@gmail.com)
 */
public class ZeroTailComplexFFTTest extends AbstractComplexFFTTest {

	@Override
	protected ComplexFFT getFftForFlatLine() {
		return new ZeroTailComplexFFT(2, 2);
	}

	@Override
	protected ComplexFFT getFftForSimplePeriod() {
		return new ZeroTailComplexFFT(2, 2);
	}

	@Override
	protected ComplexFFT getFftForShiftedSimplePeriod() {
		return new ZeroTailComplexFFT(2, 2);
	}

	@Override
	protected ComplexFFT getFftForSimplePlusShiftedSimple() {
		return new ZeroTailComplexFFT(2, 2);
	}

	@Override
	protected ComplexFFT getFftFor1000() {
		return new ZeroTailComplexFFT(2, 0);
	}

	@Override
	protected ComplexFFT getFftFor10000000() {
		return new ZeroTailComplexFFT(3, 0);
	}
}
