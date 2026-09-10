package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14081c;

    public eu0(int i10, int i11, boolean z10) {
        this.f14079a = i10;
        this.f14080b = i11;
        this.f14081c = z10;
    }

    public static ArrayList a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new eu0(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
