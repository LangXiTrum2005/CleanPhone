package androidx.constraintlayout.core.motion.utils;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards = false;
    private boolean mDone = false;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private String mType;

    private float calcY(float f) {
        this.mDone = false;
        float f2 = this.mStage1Duration;
        if (f <= f2) {
            float f3 = this.mStage1Velocity;
            return ((((this.mStage2Velocity - f3) * f) * f) / (f2 * 2.0f)) + (f3 * f);
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return this.mStage1EndPosition;
        }
        float f4 = f - f2;
        float f5 = this.mStage2Duration;
        if (f4 < f5) {
            float f6 = this.mStage1EndPosition;
            float f7 = this.mStage2Velocity;
            return ((((this.mStage3Velocity - f7) * f4) * f4) / (f5 * 2.0f)) + (f7 * f4) + f6;
        }
        if (i == 2) {
            return this.mStage2EndPosition;
        }
        float f8 = f4 - f5;
        float f9 = this.mStage3Duration;
        if (f8 > f9) {
            this.mDone = true;
            return this.mStage3EndPosition;
        }
        float f10 = this.mStage2EndPosition;
        float f11 = this.mStage3Velocity;
        return ((f11 * f8) + f10) - (((f11 * f8) * f8) / (f9 * 2.0f));
    }

    private void setup(float f, float f2, float f3, float f4, float f5) {
        this.mDone = false;
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.mStage1Velocity = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.mType = "backward accelerate, decelerate";
                this.mNumberOfStages = 2;
                this.mStage1Velocity = f;
                this.mStage2Velocity = fSqrt;
                this.mStage3Velocity = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.mStage1Duration = f8;
                this.mStage2Duration = fSqrt / f3;
                this.mStage1EndPosition = ((f + fSqrt) * f8) / 2.0f;
                this.mStage2EndPosition = f2;
                this.mStage3EndPosition = f2;
                return;
            }
            this.mType = "backward accelerate cruse decelerate";
            this.mNumberOfStages = 3;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f4;
            this.mStage3Velocity = f4;
            float f9 = (f4 - f) / f3;
            this.mStage1Duration = f9;
            float f10 = f4 / f3;
            this.mStage3Duration = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.mStage2Duration = ((f2 - f11) - f12) / f4;
            this.mStage1EndPosition = f11;
            this.mStage2EndPosition = f2 - f12;
            this.mStage3EndPosition = f2;
            return;
        }
        if (f7 >= f2) {
            this.mType = "hard stop";
            this.mNumberOfStages = 1;
            this.mStage1Velocity = f;
            this.mStage2Velocity = 0.0f;
            this.mStage1EndPosition = f2;
            this.mStage1Duration = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.mType = "cruse decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = f;
            this.mStage3Velocity = 0.0f;
            this.mStage1EndPosition = f13;
            this.mStage2EndPosition = f2;
            this.mStage1Duration = f14;
            this.mStage2Duration = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.mStage1Duration = f15;
        float f16 = fSqrt2 / f3;
        this.mStage2Duration = f16;
        if (fSqrt2 < f4) {
            this.mType = "accelerate decelerate";
            this.mNumberOfStages = 2;
            this.mStage1Velocity = f;
            this.mStage2Velocity = fSqrt2;
            this.mStage3Velocity = 0.0f;
            this.mStage1Duration = f15;
            this.mStage2Duration = f16;
            this.mStage1EndPosition = ((f + fSqrt2) * f15) / 2.0f;
            this.mStage2EndPosition = f2;
            return;
        }
        this.mType = "accelerate cruse decelerate";
        this.mNumberOfStages = 3;
        this.mStage1Velocity = f;
        this.mStage2Velocity = f4;
        this.mStage3Velocity = f4;
        float f17 = (f4 - f) / f3;
        this.mStage1Duration = f17;
        float f18 = f4 / f3;
        this.mStage3Duration = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.mStage2Duration = ((f2 - f19) - f20) / f4;
        this.mStage1EndPosition = f19;
        this.mStage2EndPosition = f2 - f20;
        this.mStage3EndPosition = f2;
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        this.mDone = false;
        this.mStartPosition = f;
        boolean z = f > f2;
        this.mBackwards = z;
        if (z) {
            setup(-f3, f - f2, f5, f6, f4);
        } else {
            setup(f3, f2 - f, f5, f6, f4);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        StringBuilder sbQ = DM.q(DM.m(DM.q(str, " ===== "), this.mType, "\n"), str);
        sbQ.append(this.mBackwards ? "backwards" : "forward ");
        sbQ.append(" time = ");
        sbQ.append(f);
        sbQ.append("  stages ");
        String strO = AbstractC5044xl.o(sbQ, this.mNumberOfStages, "\n");
        StringBuilder sb = new StringBuilder();
        sb.append(strO);
        sb.append(str);
        sb.append(" dur ");
        sb.append(this.mStage1Duration);
        sb.append(" vel ");
        sb.append(this.mStage1Velocity);
        sb.append(" pos ");
        String strJ = DM.j(sb, this.mStage1EndPosition, "\n");
        if (this.mNumberOfStages > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strJ);
            sb2.append(str);
            sb2.append(" dur ");
            sb2.append(this.mStage2Duration);
            sb2.append(" vel ");
            sb2.append(this.mStage2Velocity);
            sb2.append(" pos ");
            strJ = DM.j(sb2, this.mStage2EndPosition, "\n");
        }
        if (this.mNumberOfStages > 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strJ);
            sb3.append(str);
            sb3.append(" dur ");
            sb3.append(this.mStage3Duration);
            sb3.append(" vel ");
            sb3.append(this.mStage3Velocity);
            sb3.append(" pos ");
            strJ = DM.j(sb3, this.mStage3EndPosition, "\n");
        }
        float f2 = this.mStage1Duration;
        if (f <= f2) {
            return DM.i(strJ, str, "stage 0\n");
        }
        int i = this.mNumberOfStages;
        if (i == 1) {
            return DM.i(strJ, str, "end stage 0\n");
        }
        float f3 = f - f2;
        float f4 = this.mStage2Duration;
        if (f3 < f4) {
            return DM.i(strJ, str, " stage 1\n");
        }
        if (i == 2) {
            return DM.i(strJ, str, "end stage 1\n");
        }
        return f3 - f4 < this.mStage3Duration ? DM.i(strJ, str, " stage 2\n") : DM.i(strJ, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        float fCalcY = calcY(f);
        this.mLastPosition = f;
        return this.mBackwards ? this.mStartPosition - fCalcY : this.mStartPosition + fCalcY;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        float f2;
        float f3;
        float f4 = this.mStage1Duration;
        if (f <= f4) {
            f2 = this.mStage1Velocity;
            f3 = this.mStage2Velocity;
        } else {
            int i = this.mNumberOfStages;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.mStage2Duration;
            if (f >= f4) {
                if (i == 2) {
                    return this.mStage2EndPosition;
                }
                float f5 = f - f4;
                float f6 = this.mStage3Duration;
                if (f5 >= f6) {
                    return this.mStage3EndPosition;
                }
                float f7 = this.mStage3Velocity;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.mStage2Velocity;
            f3 = this.mStage3Velocity;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < EPSILON && Math.abs(this.mStage3EndPosition - this.mLastPosition) < EPSILON;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.mBackwards ? -getVelocity(this.mLastPosition) : getVelocity(this.mLastPosition);
    }
}
