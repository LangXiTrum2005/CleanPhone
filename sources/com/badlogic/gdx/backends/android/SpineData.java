package com.badlogic.gdx.backends.android;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SpineData {
    private ArrayList<SpineAnimation> animations;
    private String atlasPath;
    private String id;
    private boolean isAssetsFile;
    private float positionX;
    private float positionY;
    private String skeletonPath;
    private float zoom;

    public /* synthetic */ SpineData(String str, float f, float f2, float f3, String str2, String str3, boolean z, ArrayList arrayList, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, f, f2, f3, str2, str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new ArrayList() : arrayList);
    }

    public final String component1() {
        return this.id;
    }

    public final float component2() {
        return this.positionX;
    }

    public final float component3() {
        return this.positionY;
    }

    public final float component4() {
        return this.zoom;
    }

    public final String component5() {
        return this.atlasPath;
    }

    public final String component6() {
        return this.skeletonPath;
    }

    public final boolean component7() {
        return this.isAssetsFile;
    }

    public final ArrayList<SpineAnimation> component8() {
        return this.animations;
    }

    public final SpineData copy(String str, float f, float f2, float f3, String str2, String str3, boolean z, ArrayList<SpineAnimation> arrayList) {
        AbstractC2995aW.q(str, "id");
        AbstractC2995aW.q(str2, "atlasPath");
        AbstractC2995aW.q(str3, "skeletonPath");
        AbstractC2995aW.q(arrayList, "animations");
        return new SpineData(str, f, f2, f3, str2, str3, z, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpineData)) {
            return false;
        }
        SpineData spineData = (SpineData) obj;
        return AbstractC2995aW.i(this.id, spineData.id) && Float.compare(this.positionX, spineData.positionX) == 0 && Float.compare(this.positionY, spineData.positionY) == 0 && Float.compare(this.zoom, spineData.zoom) == 0 && AbstractC2995aW.i(this.atlasPath, spineData.atlasPath) && AbstractC2995aW.i(this.skeletonPath, spineData.skeletonPath) && this.isAssetsFile == spineData.isAssetsFile && AbstractC2995aW.i(this.animations, spineData.animations);
    }

    public final ArrayList<SpineAnimation> getAnimations() {
        return this.animations;
    }

    public final String getAtlasPath() {
        return this.atlasPath;
    }

    public final String getId() {
        return this.id;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final String getSkeletonPath() {
        return this.skeletonPath;
    }

    public final float getZoom() {
        return this.zoom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    public int hashCode() {
        int iD = DM.d(this.skeletonPath, DM.d(this.atlasPath, (Float.floatToIntBits(this.zoom) + ((Float.floatToIntBits(this.positionY) + ((Float.floatToIntBits(this.positionX) + (this.id.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31);
        boolean z = this.isAssetsFile;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.animations.hashCode() + ((iD + r2) * 31);
    }

    public final boolean isAssetsFile() {
        return this.isAssetsFile;
    }

    public final void setAnimations(ArrayList<SpineAnimation> arrayList) {
        AbstractC2995aW.q(arrayList, "<set-?>");
        this.animations = arrayList;
    }

    public final void setAssetsFile(boolean z) {
        this.isAssetsFile = z;
    }

    public final void setAtlasPath(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.atlasPath = str;
    }

    public final void setId(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.id = str;
    }

    public final void setPositionX(float f) {
        this.positionX = f;
    }

    public final void setPositionY(float f) {
        this.positionY = f;
    }

    public final void setSkeletonPath(String str) {
        AbstractC2995aW.q(str, "<set-?>");
        this.skeletonPath = str;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public String toString() {
        String str = this.id;
        float f = this.positionX;
        float f2 = this.positionY;
        float f3 = this.zoom;
        String str2 = this.atlasPath;
        String str3 = this.skeletonPath;
        boolean z = this.isAssetsFile;
        ArrayList<SpineAnimation> arrayList = this.animations;
        StringBuilder sb = new StringBuilder("SpineData(id=");
        sb.append(str);
        sb.append(", positionX=");
        sb.append(f);
        sb.append(", positionY=");
        sb.append(f2);
        sb.append(", zoom=");
        sb.append(f3);
        sb.append(", atlasPath=");
        AbstractC5044xl.t(sb, str2, ", skeletonPath=", str3, ", isAssetsFile=");
        sb.append(z);
        sb.append(", animations=");
        sb.append(arrayList);
        sb.append(")");
        return sb.toString();
    }

    public SpineData(String str, float f, float f2, float f3, String str2, String str3, boolean z, ArrayList<SpineAnimation> arrayList) {
        AbstractC2995aW.q(str, "id");
        AbstractC2995aW.q(str2, "atlasPath");
        AbstractC2995aW.q(str3, "skeletonPath");
        AbstractC2995aW.q(arrayList, "animations");
        this.id = str;
        this.positionX = f;
        this.positionY = f2;
        this.zoom = f3;
        this.atlasPath = str2;
        this.skeletonPath = str3;
        this.isAssetsFile = z;
        this.animations = arrayList;
    }
}
