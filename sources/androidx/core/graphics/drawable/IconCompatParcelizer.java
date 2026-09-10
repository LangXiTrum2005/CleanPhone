package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import q4.b;
import q4.c;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4015a = bVar.f(iconCompat.f4015a, 1);
        byte[] bArr = iconCompat.f4017c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f48648e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f4017c = bArr;
        iconCompat.f4018d = bVar.g(iconCompat.f4018d, 3);
        iconCompat.f4019e = bVar.f(iconCompat.f4019e, 4);
        iconCompat.f4020f = bVar.f(iconCompat.f4020f, 5);
        iconCompat.f4021g = (ColorStateList) bVar.g(iconCompat.f4021g, 6);
        String string = iconCompat.f4023i;
        if (bVar.e(7)) {
            string = ((c) bVar).f48648e.readString();
        }
        iconCompat.f4023i = string;
        String string2 = iconCompat.f4024j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f48648e.readString();
        }
        iconCompat.f4024j = string2;
        iconCompat.f4022h = PorterDuff.Mode.valueOf(iconCompat.f4023i);
        switch (iconCompat.f4015a) {
            case -1:
                Parcelable parcelable = iconCompat.f4018d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4016b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4018d;
                if (parcelable2 != null) {
                    iconCompat.f4016b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f4017c;
                iconCompat.f4016b = bArr3;
                iconCompat.f4015a = 3;
                iconCompat.f4019e = 0;
                iconCompat.f4020f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f4017c, Charset.forName(C.UTF16_NAME));
                iconCompat.f4016b = str;
                if (iconCompat.f4015a == 2 && iconCompat.f4024j == null) {
                    iconCompat.f4024j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4016b = iconCompat.f4017c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f4023i = iconCompat.f4022h.name();
        switch (iconCompat.f4015a) {
            case -1:
                iconCompat.f4018d = (Parcelable) iconCompat.f4016b;
                break;
            case 1:
            case 5:
                iconCompat.f4018d = (Parcelable) iconCompat.f4016b;
                break;
            case 2:
                iconCompat.f4017c = ((String) iconCompat.f4016b).getBytes(Charset.forName(C.UTF16_NAME));
                break;
            case 3:
                iconCompat.f4017c = (byte[]) iconCompat.f4016b;
                break;
            case 4:
            case 6:
                iconCompat.f4017c = iconCompat.f4016b.toString().getBytes(Charset.forName(C.UTF16_NAME));
                break;
        }
        int i10 = iconCompat.f4015a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f4017c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).f48648e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f4018d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f4019e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f4020f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f4021g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f4023i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f48648e.writeString(str);
        }
        String str2 = iconCompat.f4024j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f48648e.writeString(str2);
        }
    }
}
