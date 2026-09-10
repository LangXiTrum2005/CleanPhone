package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes6.dex */
public class RestStateRecognizer implements SignalProcessor {
    public static final int STATE_MOTION = 2;
    public static final int STATE_REST = 1;
    public static final int STATE_UNKNOWN = 0;
    private double acceleration;
    private double accelerationMaxSum;
    private final double alphaJerk;
    private final boolean applyCorrection;
    private double brakingAccelerationMin;
    private long brakingTimeBegin;
    private long brakingTimeEnd;
    private long brakingTimeMin;
    private final long decisionMakingIntervalNanos;
    private final long decisionValidnessIntervalNanos;
    private final long delayIntervalNanos;
    private final HighPassFilter3D forward;
    private final HighPassFilter3D gravity;
    private double jerk;
    private final HighPassFilter3D linear;
    private int maxCount;
    private Sample nearestBack;
    private Sample newest;
    private Sample oldest;
    private final SamplePool pool;
    private int samplesCount;
    private double scalarLF;
    private long stableTillTimestampNanos;
    private long startTimestampNanos;
    private int state;
    private int steadyCount;
    private long validTimestampNanos;

    public static class Sample {
        double acceleration;
        double accelerationMax;
        double accelerationMin;
        int braking;
        int max;
        long maxStartTime;
        double maxStartValue;
        int min;
        long minStartTime;
        double minStartValue;
        Sample next;
        Sample prev;
        int racing;
        int retard;
        int spurt;
        int steady;
        long timestampNanos;

        public void reset() {
            this.timestampNanos = 0L;
            this.acceleration = 0.0d;
            this.accelerationMax = 0.0d;
            this.accelerationMin = 0.0d;
            this.max = 0;
            this.min = 0;
            this.maxStartTime = 0L;
            this.maxStartValue = 0.0d;
            this.minStartTime = 0L;
            this.minStartValue = 0.0d;
            this.spurt = 0;
            this.racing = 0;
            this.steady = 0;
            this.retard = 0;
            this.braking = 0;
            this.next = null;
            this.prev = null;
        }
    }

    public static class SamplePool {
        Sample head;

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
            sample.prev = null;
            this.head = sample;
        }
    }

    public RestStateRecognizer(double d, boolean z2) {
        this(10.0d, 15.0d, 25.0d, 15.0d, 8.0d, d, 1.0d, z2);
    }

    private void addSample(Sample sample) {
        this.accelerationMaxSum += sample.accelerationMax;
        this.maxCount += sample.max;
        this.steadyCount += sample.steady;
        this.samplesCount++;
    }

    private boolean isEnoughData() {
        Sample sample;
        Sample sample2;
        if (this.samplesCount <= 1 || (sample = this.oldest) == null || (sample2 = this.newest) == null) {
            return false;
        }
        long j = sample.timestampNanos;
        return j >= this.startTimestampNanos + this.delayIntervalNanos && sample2.timestampNanos >= j + this.decisionMakingIntervalNanos && this.nearestBack != null;
    }

    private boolean isRest() {
        int i2 = this.steadyCount;
        int i3 = this.samplesCount;
        if (i2 != i3) {
            return false;
        }
        return this.maxCount <= 0 || this.accelerationMaxSum / ((double) i3) <= 0.01d;
    }

    private void removeSample(Sample sample) {
        this.accelerationMaxSum -= sample.accelerationMax;
        this.maxCount -= sample.max;
        this.steadyCount -= sample.steady;
        this.samplesCount--;
    }

    private double scalarProduct(Valuable valuable, Valuable valuable2, Valuable valuable3, Valuable valuable4, Valuable valuable5, Valuable valuable6) {
        return (valuable6.getValue() * valuable5.getValue()) + (valuable4.getValue() * valuable3.getValue()) + (valuable2.getValue() * valuable.getValue());
    }

    private double smsq(double d, double d2, double d3) {
        return (d3 * d3) + (d2 * d2) + (d * d);
    }

    private double srss(Valuable valuable, Valuable valuable2, Valuable valuable3) {
        return Math.sqrt(smsq(valuable.getValue(), valuable2.getValue(), valuable3.getValue()));
    }

    private void updateMinMax() {
        Sample sample;
        Sample sample2;
        Sample sample3 = this.newest;
        if (sample3 == null) {
            return;
        }
        while (true) {
            sample = this.nearestBack;
            if (sample3 == sample || (sample2 = sample3.prev) == null) {
                break;
            }
            double d = sample2.accelerationMax;
            double d2 = sample3.accelerationMax;
            if (d < d2) {
                sample2.accelerationMax = d2;
            }
            double d3 = sample2.accelerationMin;
            double d4 = sample3.accelerationMin;
            if (d3 > d4) {
                sample2.accelerationMin = d4;
            }
            sample3 = sample2;
        }
        if (sample3 == sample) {
            Sample sample4 = this.newest;
            double d5 = sample4.acceleration;
            Sample sample5 = sample3.next;
            if (d5 == sample5.accelerationMax) {
                sample4.max = 1;
                Sample sample6 = sample4.prev;
                sample4.maxStartTime = sample6.maxStartTime;
                sample4.maxStartValue = sample6.maxStartValue;
            } else {
                sample4.max = 0;
            }
            if (d5 != sample5.accelerationMin) {
                sample4.min = 0;
                return;
            }
            sample4.min = 1;
            Sample sample7 = sample4.prev;
            sample4.minStartTime = sample7.minStartTime;
            sample4.minStartValue = sample7.minStartValue;
        }
    }

    private Sample updateNearest(Sample sample, long j) {
        Sample sample2 = null;
        while (sample != null && sample.timestampNanos < j) {
            sample2 = sample;
            sample = sample.next;
        }
        return sample2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ee  */
    public void add(long j, double d, double d2, double d3) {
        double d4;
        double dExp;
        double dPow;
        Sample sample = this.newest;
        if (sample == null || sample.timestampNanos < j) {
            if (this.startTimestampNanos <= 0) {
                this.startTimestampNanos = j;
            }
            this.gravity.add(d, d2, d3);
            double value = d - this.gravity.getX().getValue();
            double value2 = d2 - this.gravity.getY().getValue();
            double value3 = d3 - this.gravity.getZ().getValue();
            this.linear.add(value, value2, value3);
            double value4 = this.forward.getX().getValue();
            double value5 = this.forward.getY().getValue();
            double value6 = this.forward.getZ().getValue();
            this.forward.add(value, value2, -Math.abs(value3));
            if (smsq(this.forward.getX().getValue() - value4, this.forward.getY().getValue() - value5, this.forward.getZ().getValue() - value6) > 0.01d) {
                this.validTimestampNanos = this.delayIntervalNanos + j;
            }
            this.scalarLF = scalarProduct(this.linear.getX(), this.forward.getX(), this.linear.getY(), this.forward.getY(), this.linear.getZ(), this.forward.getZ());
            if (this.applyCorrection) {
                long j2 = this.brakingTimeEnd;
                if (j <= j2 || j2 <= 0) {
                    d4 = 1.0E9d;
                    dExp = 1.0d;
                    dPow = 1.0d;
                } else {
                    long j3 = this.brakingTimeMin;
                    if (j2 > j3) {
                        d4 = 1.0E9d;
                        long j4 = this.brakingTimeBegin;
                        if (j3 > j4) {
                            dExp = 1.0d - (Math.exp(-Math.pow(((j - j2) / 1.0E9d) / ((j2 - j4) / 1.0E9d), 2.0d)) * (1.0d - Math.exp(this.brakingAccelerationMin / 3.0d)));
                            dPow = Math.pow(dExp, 0.25d);
                        }
                    } else {
                        d4 = 1.0E9d;
                    }
                    dExp = 1.0d;
                    dPow = 1.0d;
                }
            } else {
                d4 = 1.0E9d;
                dExp = 1.0d;
                dPow = 1.0d;
            }
            double d5 = this.acceleration;
            double value7 = Double.compare(this.forward.getValue(), 0.0d) == 0 ? 0.0d : (dExp * this.scalarLF) / this.forward.getValue();
            this.acceleration = value7;
            if (d5 < 0.0d) {
                if (value7 >= 0.0d) {
                    this.brakingTimeEnd = j;
                } else if (this.brakingAccelerationMin > value7) {
                    this.brakingAccelerationMin = value7;
                    this.brakingTimeMin = j;
                }
            } else if (value7 < 0.0d) {
                this.brakingTimeBegin = j;
                this.brakingTimeEnd = 0L;
                this.brakingTimeMin = j;
                this.brakingAccelerationMin = value7;
            }
            purgeRollingValues(j);
            Sample sampleAcquire = this.pool.acquire();
            sampleAcquire.timestampNanos = j;
            sampleAcquire.maxStartTime = j;
            sampleAcquire.minStartTime = j;
            double d6 = this.acceleration;
            sampleAcquire.acceleration = d6;
            sampleAcquire.accelerationMax = d6;
            sampleAcquire.accelerationMin = d6;
            sampleAcquire.maxStartValue = d6;
            sampleAcquire.minStartValue = d6;
            Sample sample2 = this.nearestBack;
            if (sample2 == null) {
                sample2 = this.oldest;
            }
            Sample sampleUpdateNearest = updateNearest(sample2, j - 100000000);
            this.nearestBack = sampleUpdateNearest;
            if (sampleUpdateNearest != null) {
                long j5 = sampleUpdateNearest.timestampNanos;
                if (j5 < j) {
                    double d7 = this.alphaJerk;
                    double d8 = ((((this.acceleration - sampleUpdateNearest.acceleration) * (1.0d - d7)) / ((j - j5) / d4)) + (this.jerk * d7)) * dPow;
                    this.jerk = d8;
                    if (d8 > 2.0d) {
                        sampleAcquire.spurt = 1;
                    } else if (d8 > 0.4d) {
                        sampleAcquire.racing = 1;
                    } else if (d8 < -2.0d) {
                        sampleAcquire.braking = 1;
                    } else if (d8 < -0.4d) {
                        sampleAcquire.retard = 1;
                    } else {
                        sampleAcquire.steady = 1;
                    }
                } else {
                    sampleAcquire.steady = 1;
                }
            } else {
                sampleAcquire.steady = 1;
            }
            Sample sample3 = this.newest;
            if (sample3 != null) {
                sample3.next = sampleAcquire;
            }
            sampleAcquire.prev = sample3;
            this.newest = sampleAcquire;
            if (this.oldest == null) {
                this.oldest = sampleAcquire;
            }
            updateMinMax();
            addSample(sampleAcquire);
            if (!isEnoughData()) {
                this.state = 0;
                this.stableTillTimestampNanos = 0L;
                return;
            }
            if (j <= this.validTimestampNanos) {
                this.state = 2;
                this.stableTillTimestampNanos = 0L;
            } else if (j > this.stableTillTimestampNanos) {
                int i2 = isRest() ? 1 : 2;
                if (i2 == 1 || this.state == 1) {
                    this.stableTillTimestampNanos = this.decisionValidnessIntervalNanos + j;
                }
                this.state = i2;
            }
        }
    }

    public double getAcceleration() {
        return this.acceleration;
    }

    public double getJerk() {
        return this.jerk;
    }

    public int getState() {
        return this.state;
    }

    public void purgeRollingValues(long j) {
        Sample sample;
        long j2 = j - this.decisionMakingIntervalNanos;
        while (true) {
            Sample sample2 = this.oldest;
            if (sample2 == null || sample2.timestampNanos >= j2 || (sample = sample2.next) == null || sample.timestampNanos >= j2) {
                return;
            }
            this.oldest = sample;
            sample.prev = null;
            removeSample(sample2);
            this.pool.release(sample2);
        }
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        while (true) {
            Sample sample = this.oldest;
            if (sample == null) {
                this.nearestBack = null;
                this.newest = null;
                this.startTimestampNanos = 0L;
                this.validTimestampNanos = 0L;
                this.stableTillTimestampNanos = 0L;
                this.gravity.reset();
                this.linear.reset();
                this.forward.reset();
                this.scalarLF = 0.0d;
                this.acceleration = 0.0d;
                this.jerk = 0.0d;
                this.accelerationMaxSum = 0.0d;
                this.maxCount = 0;
                this.steadyCount = 0;
                this.samplesCount = 0;
                this.state = 0;
                return;
            }
            this.oldest = sample.next;
            this.pool.release(sample);
        }
    }

    private RestStateRecognizer(double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z2) {
        this.pool = new SamplePool();
        this.state = 0;
        this.alphaJerk = d4 / (1.0d + d4);
        this.delayIntervalNanos = (long) (d5 * 1.0E9d);
        this.decisionMakingIntervalNanos = (long) (d6 * 1.0E9d);
        this.decisionValidnessIntervalNanos = (long) (1.0E9d * d7);
        this.applyCorrection = z2;
        this.gravity = new HighPassFilter3D(new HighPassFilter(d), new HighPassFilter(d), new HighPassFilter(d));
        this.linear = new HighPassFilter3D(new HighPassFilter(d2), new HighPassFilter(d2), new HighPassFilter(d2));
        this.forward = new HighPassFilter3D(new HighPassFilter(d3), new HighPassFilter(d3), new HighPassFilter(d3));
    }
}
