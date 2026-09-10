package com.startapp.sdk.internal;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ce extends k6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb f40876e;
    public final lb f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f40877h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final be f40878i;

    public ce(Context context, lb lbVar, lb lbVar2, String str, String str2) {
        super(context, 1000L);
        this.f40878i = new be(this);
        this.f40876e = lbVar;
        this.f = lbVar2;
        this.g = str;
        this.f40877h = str2;
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a() {
        Object objA;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            objA = a(((vf) this.f40876e.a()).getString(this.g, null));
        }
        return objA;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            try {
                uf ufVarEdit = ((vf) this.f40876e.a()).edit();
                String str = this.g;
                String strC = c(obj);
                ufVarEdit.a(str, strC);
                ufVarEdit.f41545a.putString(str, strC);
                String str2 = this.f40877h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                ufVarEdit.a(str2, Long.valueOf(jCurrentTimeMillis));
                ufVarEdit.f41545a.putLong(str2, jCurrentTimeMillis);
                ufVarEdit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        a(Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, d()));
    }

    public String c(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public abstract long d();

    public final synchronized void e() {
        a(Math.max(0L, (Math.max(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, d()) + ((vf) this.f40876e.a()).getLong(this.f40877h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j) {
        if (f()) {
            m8 m8Var = (m8) this.f.a();
            m8Var.f41243a.removeCallbacks(this.f40878i);
            m8 m8Var2 = (m8) this.f.a();
            m8Var2.f41243a.postDelayed(this.f40878i, j);
        }
    }
}
