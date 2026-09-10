package wi;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f53273e;

    public o(String str, int i10, int i11, int i12, int i13) {
        if (!(i10 == -1 && i11 == -1) && (i10 < 0 || i11 < 0)) {
            throw new IndexOutOfBoundsException(l1.d.f("invalid selection: (", i10, ", ", i11, ")"));
        }
        if (!(i12 == -1 && i13 == -1) && (i12 < 0 || i12 > i13)) {
            throw new IndexOutOfBoundsException(l1.d.f("invalid composing range: (", i12, ", ", i13, ")"));
        }
        if (i13 > str.length()) {
            throw new IndexOutOfBoundsException(l1.d.e(i12, "invalid composing start: "));
        }
        if (i10 > str.length()) {
            throw new IndexOutOfBoundsException(l1.d.e(i10, "invalid selection start: "));
        }
        if (i11 > str.length()) {
            throw new IndexOutOfBoundsException(l1.d.e(i11, "invalid selection end: "));
        }
        this.f53269a = str;
        this.f53270b = i10;
        this.f53271c = i11;
        this.f53272d = i12;
        this.f53273e = i13;
    }

    public static o a(JSONObject jSONObject) {
        return new o(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
