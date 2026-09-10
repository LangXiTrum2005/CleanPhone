package sg.bigo.ads.api.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f47005h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f47006i = 3;
    private static boolean j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47007a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f47008b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47009c = false;
    public boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47010e = false;
    public long f = -1;
    public boolean g = false;

    public static void a() {
        f47006i = 1;
    }

    public static int b() {
        return f47005h;
    }

    public static void a(int i2) {
        f47005h = i2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    public static b b(int i2) {
        b bVar = new b();
        if (j) {
            bVar.g = true;
            bVar.f47009c = true;
            bVar.f47008b = true;
            bVar.f = 2000L;
        } else if (i2 == 2) {
            bVar.g = true;
            bVar.f47009c = true;
            bVar.f47008b = true;
            bVar.f = 2000L;
            bVar.f47007a = 4;
        } else {
            if (i2 == 3) {
                bVar.g = true;
                bVar.f47009c = true;
            } else if (i2 != 4) {
                if (i2 == 12) {
                    bVar.g = true;
                    bVar.f47009c = true;
                    bVar.f47008b = true;
                    bVar.f = 2000L;
                } else if (i2 == 20) {
                    bVar.f47009c = true;
                }
                bVar.f47007a = 4;
            } else {
                bVar.g = true;
                bVar.f47009c = true;
                bVar.f47008b = true;
            }
            bVar.f = 2000L;
            bVar.f47007a = f47006i;
        }
        f47006i = 3;
        return bVar;
    }

    public static void a(boolean z2) {
        j = z2;
    }
}
