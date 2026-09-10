package com.badlogic.gdx.backends.android;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public final class SpineAnimation {
    private String animationName;
    private float delayMS;
    private boolean loop;

    public /* synthetic */ SpineAnimation(String str, boolean z, float f, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? 0.0f : f);
    }

    public static /* synthetic */ SpineAnimation copy$default(SpineAnimation spineAnimation, String str, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spineAnimation.animationName;
        }
        if ((i & 2) != 0) {
            z = spineAnimation.loop;
        }
        if ((i & 4) != 0) {
            f = spineAnimation.delayMS;
        }
        return spineAnimation.copy(str, z, f);
    }

    public final String component1() {
        return this.animationName;
    }

    public final boolean component2() {
        return this.loop;
    }

    public final float component3() {
        return this.delayMS;
    }

    public final SpineAnimation copy(String str, boolean z, float f) {
        AbstractC2995aW.q(str, "animationName");
        return new SpineAnimation(str, z, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpineAnimation)) {
            return false;
        }
        SpineAnimation spineAnimation = (SpineAnimation) obj;
        return AbstractC2995aW.i(this.animationName, spineAnimation.animationName) && this.loop == spineAnimation.loop && Float.compare(this.delayMS, spineAnimation.delayMS) == 0;
    }

    public final String getAnimationName() {
        return this.animationName;
    }

    public final float getDelayMS() {
        return this.delayMS;
    }

    public final boolean getLoop() {
        return this.loop;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        int iHashCode = this.animationName.hashCode() * 31;
        boolean z = this.loop;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return Float.floatToIntBits(this.delayMS) + ((iHashCode + r1) * 31);
    }

    public final void setAnimationName(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.animationName = str;
    }

    public final void setDelayMS(float f) {
        this.delayMS = f;
    }

    public final void setLoop(boolean z) {
        this.loop = z;
    }

    public String toString() {
        String str = this.animationName;
        boolean z = this.loop;
        float f = this.delayMS;
        StringBuilder sb = new StringBuilder("SpineAnimation(animationName=");
        sb.append(str);
        sb.append(", loop=");
        sb.append(z);
        sb.append(", delayMS=");
        return DM.j(sb, f, ")");
    }

    public SpineAnimation(String str, boolean z, float f) {
        AbstractC2995aW.q(str, "animationName");
        this.animationName = str;
        this.loop = z;
        this.delayMS = f;
    }
}
