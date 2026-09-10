package igbo;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: RemoteInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f28368attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final Bundle f28369beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final Set<String> f28370competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final CharSequence[] f28371dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f28372marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final CharSequence f28373saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f28374wireman;

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class attabal {
        public static RemoteInput attabal(gintrap gintrapVar) {
            Set<String> setWireman;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(gintrapVar.taiyuan()).setLabel(gintrapVar.impromptu()).setChoices(gintrapVar.marial()).setAllowFreeFormInput(gintrapVar.dern()).addExtras(gintrapVar.competently());
            if (Build.VERSION.SDK_INT >= 26 && (setWireman = gintrapVar.wireman()) != null) {
                Iterator<String> it = setWireman.iterator();
                while (it.hasNext()) {
                    saneness.attabal(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                dern.attabal(builderAddExtras, gintrapVar.beachfront());
            }
            return builderAddExtras.build();
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class dern {
        public static RemoteInput.Builder attabal(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* JADX INFO: compiled from: RemoteInput.java */
    public static class saneness {
        public static RemoteInput.Builder attabal(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    public gintrap(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f28368attabal = str;
        this.f28373saneness = charSequence;
        this.f28371dern = charSequenceArr;
        this.f28374wireman = z;
        this.f28372marial = i;
        this.f28369beachfront = bundle;
        this.f28370competently = set;
        if (beachfront() == 2 && !dern()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput attabal(gintrap gintrapVar) {
        return attabal.attabal(gintrapVar);
    }

    public static RemoteInput[] saneness(gintrap[] gintrapVarArr) {
        if (gintrapVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[gintrapVarArr.length];
        for (int i = 0; i < gintrapVarArr.length; i++) {
            remoteInputArr[i] = attabal(gintrapVarArr[i]);
        }
        return remoteInputArr;
    }

    public int beachfront() {
        return this.f28372marial;
    }

    public Bundle competently() {
        return this.f28369beachfront;
    }

    public boolean cutely() {
        if (dern()) {
            return false;
        }
        return ((marial() != null && marial().length != 0) || wireman() == null || wireman().isEmpty()) ? false : true;
    }

    public boolean dern() {
        return this.f28374wireman;
    }

    public CharSequence impromptu() {
        return this.f28373saneness;
    }

    public CharSequence[] marial() {
        return this.f28371dern;
    }

    public String taiyuan() {
        return this.f28368attabal;
    }

    public Set<String> wireman() {
        return this.f28370competently;
    }
}
