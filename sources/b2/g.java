package b2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements n2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2.i f5266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f5267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f5268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f5271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n2.m f5272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5273h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f5274i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile int f5275j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5276k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5277m;

    public g(m mVar, int i10) {
        c2.i dVar;
        c2.i iVar;
        this.f5269d = i10;
        String str = mVar.f5327c.f42643n;
        str.getClass();
        switch (str) {
            case "video/3gpp":
                dVar = new c2.d(mVar, 0);
                iVar = dVar;
                break;
            case "video/hevc":
                dVar = new c2.e(mVar, 1);
                iVar = dVar;
                break;
            case "audio/amr-wb":
            case "audio/3gpp":
                dVar = new c2.c(mVar);
                iVar = dVar;
                break;
            case "audio/mp4a-latm":
                dVar = mVar.f5329e.equals("MP4A-LATM") ? new c2.f(mVar) : new c2.a(mVar);
                iVar = dVar;
                break;
            case "audio/ac3":
                dVar = new c2.b(mVar);
                iVar = dVar;
                break;
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                dVar = new c2.j(mVar);
                iVar = dVar;
                break;
            case "video/mp4v-es":
                dVar = new c2.g(mVar);
                iVar = dVar;
                break;
            case "video/avc":
                dVar = new c2.e(mVar, 0);
                iVar = dVar;
                break;
            case "audio/opus":
                dVar = new c2.h(mVar);
                iVar = dVar;
                break;
            case "video/x-vnd.on2.vp8":
                dVar = new c2.k(mVar);
                iVar = dVar;
                break;
            case "video/x-vnd.on2.vp9":
                dVar = new c2.d(mVar, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f5266a = iVar;
        this.f5267b = new l1.q(65507);
        this.f5268c = new l1.q();
        this.f5270e = new Object();
        this.f5271f = new l();
        this.f5274i = C.TIME_UNSET;
        this.f5275j = -1;
        this.l = C.TIME_UNSET;
        this.f5277m = C.TIME_UNSET;
    }

    @Override // n2.k
    public final boolean a(n2.l lVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Failed to calculate best type for var: r6v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // n2.k
    public final int b(n2.l r18, com.google.android.gms.internal.ads.q2 r19) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.g.b(n2.l, com.google.android.gms.internal.ads.q2):int");
    }

    @Override // n2.k
    public final void c(n2.m mVar) {
        this.f5266a.a(mVar, this.f5269d);
        mVar.endTracks();
        mVar.u(new n2.o(C.TIME_UNSET));
        this.f5272g = mVar;
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        synchronized (this.f5270e) {
            try {
                if (!this.f5276k) {
                    this.f5276k = true;
                }
                this.l = j10;
                this.f5277m = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n2.k
    public final void release() {
    }
}
