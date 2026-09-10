package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qt extends qh implements st {
    public qt() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static st x1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof st ? (st) iInterfaceQueryLocalInterface : new rt(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.st
    public final ut b(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, qt.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new ju((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new ju((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 64);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(" (not a valid adapter).");
                zzo.zzi(sb2.toString());
                throw new RemoteException();
            } catch (Throwable th2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Could not instantiate mediation adapter: ");
                sb3.append(str);
                sb3.append(". ");
                zzo.zzj(sb3.toString(), th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzo.zzd("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new ju(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new ju(new CustomEventAdapter());
            }
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.st
    public final boolean f(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, qt.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + InterfaceC0435l1.d.b.f29108e);
            sb2.append("Could not load custom event implementation class as Adapter: ");
            sb2.append(str);
            sb2.append(", assuming old custom event implementation.");
            zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            String string = parcel.readString();
            rh.f(parcel);
            ut utVarB = b(string);
            parcel2.writeNoException();
            rh.e(parcel2, utVarB);
            return true;
        }
        if (i10 == 2) {
            String string2 = parcel.readString();
            rh.f(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
            return true;
        }
        if (i10 == 3) {
            String string3 = parcel.readString();
            rh.f(parcel);
            av avVarZze = zze(string3);
            parcel2.writeNoException();
            rh.e(parcel2, avVarZze);
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        String string4 = parcel.readString();
        rh.f(parcel);
        boolean zF = f(string4);
        parcel2.writeNoException();
        parcel2.writeInt(zF ? 1 : 0);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.st
    public final boolean zzc(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, qt.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("Could not load custom event implementation class: ");
            sb2.append(str);
            sb2.append(", trying Adapter implementation class.");
            zzo.zzi(sb2.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.st
    public final av zze(String str) throws RemoteException {
        try {
            return new ev((RtbAdapter) Class.forName(str, false, dv.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }
}
