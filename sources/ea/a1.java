package ea;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.ts;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends t1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pair f39203z = new Pair("", 0L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f39204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f39205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ts f39206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z0 f39207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bc.s f39208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z0 f39212k;
    public final y0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bc.s f39213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k5.g f39214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f39215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0 f39216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f39217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f39218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f39219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f39220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final z0 f39221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final bc.s f39222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final bc.s f39223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z0 f39224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k5.g f39225y;

    public a1(m1 m1Var) {
        super(m1Var);
        this.f39212k = new z0(this, "session_timeout", 1800000L);
        this.l = new y0(this, "start_new_session", true);
        this.f39216p = new z0(this, "last_pause_time", 0L);
        this.f39217q = new z0(this, "session_id", 0L);
        this.f39213m = new bc.s(this, "non_personalized_ads");
        this.f39214n = new k5.g(this, "last_received_uri_timestamps_by_source");
        this.f39215o = new y0(this, "allow_remote_dynamite", false);
        this.f39207f = new z0(this, "first_open_time", 0L);
        k9.c0.e("app_install_time");
        this.f39208g = new bc.s(this, "app_instance_id");
        this.f39219s = new y0(this, "app_backgrounded", false);
        this.f39220t = new y0(this, "deep_link_retrieval_complete", false);
        this.f39221u = new z0(this, "deep_link_retrieval_attempts", 0L);
        this.f39222v = new bc.s(this, "firebase_feature_rollouts");
        this.f39223w = new bc.s(this, "deferred_attribution_cache");
        this.f39224x = new z0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f39225y = new k5.g(this, "default_event_parameters");
    }

    @Override // ea.t1
    public final boolean H0() {
        return true;
    }

    public final SharedPreferences K0() {
        G0();
        I0();
        k9.c0.h(this.f39204c);
        return this.f39204c;
    }

    public final SharedPreferences L0() {
        G0();
        I0();
        if (this.f39205d == null) {
            m1 m1Var = (m1) this.f3623a;
            String strValueOf = String.valueOf(m1Var.f39582a.getPackageName());
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            bo.b bVar = s0Var.f39760n;
            String strConcat = strValueOf.concat("_preferences");
            bVar.c(strConcat, "Default prefs file");
            this.f39205d = m1Var.f39582a.getSharedPreferences(strConcat, 0);
        }
        return this.f39205d;
    }

    public final SparseArray M0() {
        Bundle bundleE = this.f39214n.E();
        int[] intArray = bundleE.getIntArray("uriSources");
        long[] longArray = bundleE.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    public final y1 N0() {
        G0();
        return y1.c(K0().getInt("consent_source", 100), K0().getString("consent_settings", "G1"));
    }

    public final void O0(boolean z10) {
        G0();
        s0 s0Var = ((m1) this.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39760n.c(Boolean.valueOf(z10), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = K0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }

    public final boolean P0(long j10) {
        return j10 - this.f39212k.e() > this.f39216p.e();
    }
}
