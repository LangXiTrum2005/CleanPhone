package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes6.dex */
public class Vibration3DRecognizer implements SignalProcessor, Periodical {
    private double amplitude;
    private double frequency;
    private final VibrationRecognizer x;
    private final VibrationRecognizer y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final VibrationRecognizer f40419z;

    public Vibration3DRecognizer(VibrationRecognizer vibrationRecognizer, VibrationRecognizer vibrationRecognizer2, VibrationRecognizer vibrationRecognizer3) {
        this.x = vibrationRecognizer;
        this.y = vibrationRecognizer2;
        this.f40419z = vibrationRecognizer3;
    }

    public void add(long j, double d, double d2, double d3) {
        this.x.add(j, d);
        this.y.add(j, d2);
        this.f40419z.add(j, d3);
        double amplitude = this.x.getAmplitude();
        double amplitude2 = this.y.getAmplitude();
        double amplitude3 = this.f40419z.getAmplitude();
        double d4 = amplitude + amplitude2 + amplitude3;
        if (d4 <= 0.0d) {
            this.frequency = 0.0d;
            this.amplitude = 0.0d;
            return;
        }
        this.frequency = ((this.x.getFrequency() * amplitude) / d4) + ((this.y.getFrequency() * amplitude2) / d4) + ((this.f40419z.getFrequency() * amplitude3) / d4);
        this.amplitude = d4 / 3.0d;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getAmplitude() {
        return this.amplitude;
    }

    @Override // com.startapp.motiondetector.Periodical
    public double getFrequency() {
        return this.frequency;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.x.reset();
        this.y.reset();
        this.f40419z.reset();
        this.frequency = 0.0d;
        this.amplitude = 0.0d;
    }
}
