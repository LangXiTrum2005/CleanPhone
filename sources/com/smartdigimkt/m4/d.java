package com.smartdigimkt.m4;

import com.smartdigimkt.j4.e0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {
    private final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f36676h;

    public d(e0 e0Var, int i2) {
        this(e0Var, i2, 0, null);
    }

    @Override // com.smartdigimkt.m4.f
    public void a(long j, long j2, long j3) {
    }

    @Override // com.smartdigimkt.m4.f
    public int h() {
        return this.g;
    }

    @Override // com.smartdigimkt.m4.f
    public int i() {
        return 0;
    }

    @Override // com.smartdigimkt.m4.f
    public Object k() {
        return this.f36676h;
    }

    public d(e0 e0Var, int i2, int i3, Object obj) {
        super(e0Var, i2);
        this.g = i3;
        this.f36676h = obj;
    }

    public static final class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f36678b;

        public a() {
            this.f36677a = 0;
            this.f36678b = null;
        }

        @Override // com.smartdigimkt.m4.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(e0 e0Var, int... iArr) {
            com.smartdigimkt.p4.a.a(iArr.length == 1);
            return new d(e0Var, iArr[0], this.f36677a, this.f36678b);
        }

        public a(int i2, Object obj) {
            this.f36677a = i2;
            this.f36678b = obj;
        }
    }
}
