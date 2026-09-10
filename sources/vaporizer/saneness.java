package vaporizer;

import android.content.Context;

/* JADX INFO: compiled from: AutoValue_CreationContext.java */
/* JADX INFO: loaded from: classes2.dex */
public final class saneness extends beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f39289attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final bramley.attabal f39290dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final bramley.attabal f39291saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f39292wireman;

    public saneness(Context context, bramley.attabal attabalVar, bramley.attabal attabalVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f39289attabal = context;
        if (attabalVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f39291saneness = attabalVar;
        if (attabalVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f39290dern = attabalVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f39292wireman = str;
    }

    @Override // vaporizer.beachfront
    public String dern() {
        return this.f39292wireman;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof beachfront) {
            beachfront beachfrontVar = (beachfront) obj;
            if (this.f39289attabal.equals(beachfrontVar.saneness()) && this.f39291saneness.equals(beachfrontVar.marial()) && this.f39290dern.equals(beachfrontVar.wireman()) && this.f39292wireman.equals(beachfrontVar.dern())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f39289attabal.hashCode() ^ 1000003) * 1000003) ^ this.f39291saneness.hashCode()) * 1000003) ^ this.f39290dern.hashCode()) * 1000003) ^ this.f39292wireman.hashCode();
    }

    @Override // vaporizer.beachfront
    public bramley.attabal marial() {
        return this.f39291saneness;
    }

    @Override // vaporizer.beachfront
    public Context saneness() {
        return this.f39289attabal;
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f39289attabal + ", wallClock=" + this.f39291saneness + ", monotonicClock=" + this.f39290dern + ", backendName=" + this.f39292wireman + "}";
    }

    @Override // vaporizer.beachfront
    public bramley.attabal wireman() {
        return this.f39290dern;
    }
}
