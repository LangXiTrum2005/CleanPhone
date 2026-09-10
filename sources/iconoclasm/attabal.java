package iconoclasm;

/* JADX INFO: compiled from: SimpleSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Object[] f28351arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final String f28352kowloon;

    public attabal(String str, Object[] objArr) {
        this.f28352kowloon = str;
        this.f28351arytenoidectomy = objArr;
    }

    public static void dern(wireman wiremanVar, int i, Object obj) {
        if (obj == null) {
            wiremanVar.lotta(i);
            return;
        }
        if (obj instanceof byte[]) {
            wiremanVar.premeiotic(i, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            wiremanVar.polloi(i, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            wiremanVar.polloi(i, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            wiremanVar.permissivist(i, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            wiremanVar.permissivist(i, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            wiremanVar.permissivist(i, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            wiremanVar.permissivist(i, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            wiremanVar.peridotite(i, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            wiremanVar.permissivist(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void wireman(wireman wiremanVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            dern(wiremanVar, i, obj);
        }
    }

    @Override // iconoclasm.marial
    public String attabal() {
        return this.f28352kowloon;
    }

    @Override // iconoclasm.marial
    public void saneness(wireman wiremanVar) {
        wireman(wiremanVar, this.f28351arytenoidectomy);
    }

    public attabal(String str) {
        this(str, null);
    }
}
