package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import igbo.gintrap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: NotificationCompatJellybean.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f9266attabal = new Object();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Object f9267saneness = new Object();

    public static gintrap attabal(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new gintrap(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS), hashSet);
    }

    public static Bundle beachfront(gintrap gintrapVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", gintrapVar.taiyuan());
        bundle.putCharSequence("label", gintrapVar.impromptu());
        bundle.putCharSequenceArray("choices", gintrapVar.marial());
        bundle.putBoolean("allowFreeFormInput", gintrapVar.dern());
        bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, gintrapVar.competently());
        Set<String> setWireman = gintrapVar.wireman();
        if (setWireman != null && !setWireman.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setWireman.size());
            Iterator<String> it = setWireman.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] competently(gintrap[] gintrapVarArr) {
        if (gintrapVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[gintrapVarArr.length];
        for (int i = 0; i < gintrapVarArr.length; i++) {
            bundleArr[i] = beachfront(gintrapVarArr[i]);
        }
        return bundleArr;
    }

    public static NotificationCompat.saneness dern(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        return new NotificationCompat.saneness(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS), saneness(wireman(bundle, "remoteInputs")), saneness(wireman(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    public static Bundle marial(NotificationCompat.saneness sanenessVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatWireman = sanenessVar.wireman();
        bundle.putInt("icon", iconCompatWireman != null ? iconCompatWireman.getResId() : 0);
        bundle.putCharSequence("title", sanenessVar.impromptu());
        bundle.putParcelable("actionIntent", sanenessVar.attabal());
        Bundle bundle2 = sanenessVar.dern() != null ? new Bundle(sanenessVar.dern()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", sanenessVar.saneness());
        bundle.putBundle(HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        bundle.putParcelableArray("remoteInputs", competently(sanenessVar.marial()));
        bundle.putBoolean("showsUserInterface", sanenessVar.competently());
        bundle.putInt("semanticAction", sanenessVar.beachfront());
        return bundle;
    }

    public static gintrap[] saneness(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        gintrap[] gintrapVarArr = new gintrap[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            gintrapVarArr[i] = attabal(bundleArr[i]);
        }
        return gintrapVarArr;
    }

    public static Bundle[] wireman(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }
}
