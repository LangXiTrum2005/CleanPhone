package com.smartdigimkt.h8;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
class b {

    public static class a extends j {
        public a(int i2, int i3, Object obj, int i4, boolean z2) {
            super(i2, i3, obj, i4, z2);
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 7;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            if (abstractC0504b.a() != 7) {
                return false;
            }
            Object obj = ((a) abstractC0504b).f35731b;
            Object obj2 = this.f35731b;
            if (obj2 == obj) {
                return true;
            }
            if (obj2 != null && obj != null) {
                if (obj2 instanceof String) {
                    return obj2.equals(obj);
                }
                if ((obj2 instanceof byte[]) && (obj instanceof byte[])) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj);
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.h8.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0504b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35725a;

        public abstract byte a();

        public abstract boolean a(AbstractC0504b abstractC0504b);
    }

    public static class c extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f35726b;

        public c(int i2, boolean z2) {
            this.f35725a = i2;
            this.f35726b = z2;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 1;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 1 && ((c) abstractC0504b).f35726b == this.f35726b;
        }
    }

    public static class d extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f35727b;

        public d(int i2, double d) {
            this.f35725a = i2;
            this.f35727b = d;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 5;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 5 && ((d) abstractC0504b).f35727b == this.f35727b;
        }
    }

    public static class e extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f35728b;

        public e(int i2, float f) {
            this.f35725a = i2;
            this.f35728b = f;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 3;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 3 && ((e) abstractC0504b).f35728b == this.f35728b;
        }
    }

    public static class f extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f35729b;

        public f(int i2, int i3) {
            this.f35725a = i2;
            this.f35729b = i3;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 2;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 2 && ((f) abstractC0504b).f35729b == this.f35729b;
        }
    }

    public static class g extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f35730b;

        public g(int i2, long j) {
            this.f35725a = i2;
            this.f35730b = j;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 4;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 4 && ((g) abstractC0504b).f35730b == this.f35730b;
        }
    }

    public static class h extends j {
        com.smartdigimkt.i8.b f;

        public h(int i2, int i3, Object obj, int i4, boolean z2) {
            super(i2, i3, obj, i4, z2);
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 8;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            return abstractC0504b.a() == 8 && Objects.equals(((h) abstractC0504b).f35731b, this.f35731b);
        }
    }

    public static class i extends j {
        public i(int i2, int i3, String str, int i4, boolean z2) {
            super(i2, i3, str, i4, z2);
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public byte a() {
            return (byte) 6;
        }

        @Override // com.smartdigimkt.h8.b.AbstractC0504b
        public boolean a(AbstractC0504b abstractC0504b) {
            if (abstractC0504b.a() != 6) {
                return false;
            }
            i iVar = (i) abstractC0504b;
            return iVar.f35733e == this.f35733e && Objects.equals(iVar.f35731b, this.f35731b);
        }
    }

    public static abstract class j extends AbstractC0504b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f35731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f35732c;
        int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f35733e;

        public j(int i2, int i3, Object obj, int i4, boolean z2) {
            this.f35732c = i2;
            this.f35725a = i3;
            this.f35731b = obj;
            this.d = i4;
            this.f35733e = z2;
        }
    }
}
