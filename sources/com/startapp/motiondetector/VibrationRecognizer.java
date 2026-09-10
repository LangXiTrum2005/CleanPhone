package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes6.dex */
public class VibrationRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double amplitudeSum;
    private final Valuable average;
    private final long decisionMakingIntervalNanos;
    private double frequency;
    private long localMaxTime;
    private double localMaxValue;
    private long localZeroTime;
    private final double minAmplitude;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool = new SamplePool();
    private long t1;
    private long t2;
    private double v0;
    private double v1;
    private double v2;
    private int zeros;

    public static class Sample {
        double amplitude;
        Sample next;
        long time;
        long timeZero;
        int zero;

        public void reset() {
            this.next = null;
            this.time = 0L;
            this.timeZero = 0L;
            this.zero = 0;
            this.amplitude = 0.0d;
        }
    }

    public static class SamplePool {
        private Sample head;

        public Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            sample.reset();
            return sample;
        }

        public void release(Sample sample) {
            sample.next = this.head;
            this.head = sample;
        }
    }

    public VibrationRecognizer(double d, double d2, Valuable valuable) {
        this.decisionMakingIntervalNanos = (long) (d * 1.0E9d);
        this.minAmplitude = d2;
        this.average = valuable;
    }

    private void addSample(Sample sample) {
        this.zeros += sample.zero;
        this.amplitudeSum += sample.amplitude;
    }

    private void removeSample(Sample sample) {
        this.zeros -= sample.zero;
        this.amplitudeSum -= sample.amplitude;
    }

    public void add(long j, double d) {
        this.v0 = this.v1;
        this.v1 = this.v2;
        this.v2 = d;
        this.t1 = this.t2;
        this.t2 = j;
        purgeSamples(j);
        Sample sampleAcquire = this.pool.acquire();
        sampleAcquire.time = this.t2;
        sampleAcquire.timeZero = this.localZeroTime;
        double value = this.average.getValue();
        double d2 = this.v0;
        double d3 = this.v1;
        if (d2 < d3 && d3 > this.v2) {
            double d4 = d3 - value;
            if (d4 > this.minAmplitude) {
                this.localMaxValue = d4;
                this.localMaxTime = this.t1;
            }
        }
        if (d3 > value && value > this.v2 && this.localMaxTime > this.localZeroTime) {
            this.localZeroTime = this.t2;
            sampleAcquire.zero = 1;
            sampleAcquire.amplitude = this.localMaxValue;
        }
        addSample(sampleAcquire);
        Sample sample = this.newest;
        if (sample != null) {
            sample.next = sampleAcquire;
        }
        this.newest = sampleAcquire;
        if (this.oldest == null) {
            this.oldest = sampleAcquire;
        }
        long j2 = this.localZeroTime - this.oldest.timeZero;
        if (j2 > 0) {
            this.frequency = ((double) this.zeros) / (j2 / 1.0E9d);
        }
        int i2 = this.zeros;
        if (i2 > 0) {
            this.amplitude = this.amplitudeSum / ((double) i2);
        } else {
            this.amplitude = 0.0d;
        }
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    public void purgeSamples(long j) {
        Sample sample;
        long j2 = j - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.time >= j2 || (sample = sample2.next) == null || sample.time >= j2) {
                return;
            }
            this.oldest = sample;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.newest = null;
                this.v0 = 0.0d;
                this.v1 = 0.0d;
                this.v2 = 0.0d;
                this.t1 = 0L;
                this.t2 = 0L;
                this.localMaxValue = 0.0d;
                this.localMaxTime = 0L;
                this.localZeroTime = 0L;
                this.zeros = 0;
                this.frequency = 0.0d;
                this.amplitude = 0.0d;
                this.amplitudeSum = 0.0d;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }
}
