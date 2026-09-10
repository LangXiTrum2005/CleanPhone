package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q4.b;
import q4.c;
import q4.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f4008a;
        boolean z10 = true;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f4008a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f4009b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f48648e);
        }
        remoteActionCompat.f4009b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4010c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f48648e);
        }
        remoteActionCompat.f4010c = charSequence2;
        remoteActionCompat.f4011d = (PendingIntent) bVar.g(remoteActionCompat.f4011d, 4);
        boolean z11 = remoteActionCompat.f4012e;
        if (bVar.e(5)) {
            z11 = ((c) bVar).f48648e.readInt() != 0;
        }
        remoteActionCompat.f4012e = z11;
        boolean z12 = remoteActionCompat.f4013f;
        if (!bVar.e(6)) {
            z10 = z12;
        } else if (((c) bVar).f48648e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f4013f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4008a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4009b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f48648e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4010c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f4011d, 4);
        boolean z10 = remoteActionCompat.f4012e;
        bVar.i(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f4013f;
        bVar.i(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
