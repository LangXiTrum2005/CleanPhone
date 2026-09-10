package com.efs.sdk.net.a;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f725a;
    long b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;
    public long g;
    public String h;
    public int i;
    public String j;
    public String k;
    public Map<String, String> l;
    public long m;

    public final String toString() {
        StringBuilder sb = new StringBuilder("OkHttpInterceptorModle{mRequestId='");
        sb.append(this.f725a);
        sb.append("', mUrl='");
        sb.append(this.d);
        sb.append("', mMethod='");
        sb.append(this.e);
        sb.append("', mStatus=");
        sb.append(this.i);
        sb.append(", mContentType='");
        sb.append(this.j);
        sb.append("', mCreateTime=");
        sb.append(this.b);
        sb.append(", mCURL='");
        return DM.m(sb, this.c, "'}");
    }
}
