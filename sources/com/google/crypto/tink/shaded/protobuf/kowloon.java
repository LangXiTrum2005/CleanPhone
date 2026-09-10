package com.google.crypto.tink.shaded.protobuf;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: ExtensionRegistryLite.java */
/* JADX INFO: loaded from: classes3.dex */
public class kowloon {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final kowloon f22235dern = new kowloon(true);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile kowloon f22236saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<attabal, GeneratedMessageLite.marial<?, ?>> f22237attabal;

    /* JADX INFO: compiled from: ExtensionRegistryLite.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Object f22238attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f22239saneness;

        public attabal(Object obj, int i) {
            this.f22238attabal = obj;
            this.f22239saneness = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof attabal)) {
                return false;
            }
            attabal attabalVar = (attabal) obj;
            return this.f22238attabal == attabalVar.f22238attabal && this.f22239saneness == attabalVar.f22239saneness;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f22238attabal) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f22239saneness;
        }
    }

    public kowloon() {
        this.f22237attabal = new HashMap();
    }

    public static kowloon saneness() {
        kowloon kowloonVarAttabal;
        if (clubfoot.f22174wireman) {
            return f22235dern;
        }
        kowloon kowloonVar = f22236saneness;
        if (kowloonVar != null) {
            return kowloonVar;
        }
        synchronized (kowloon.class) {
            try {
                kowloonVarAttabal = f22236saneness;
                if (kowloonVarAttabal == null) {
                    kowloonVarAttabal = triweekly.attabal();
                    f22236saneness = kowloonVarAttabal;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kowloonVarAttabal;
    }

    public <ContainingType extends privatdozent> GeneratedMessageLite.marial<ContainingType, ?> attabal(ContainingType containingtype, int i) {
        return (GeneratedMessageLite.marial) this.f22237attabal.get(new attabal(containingtype, i));
    }

    public kowloon(boolean z) {
        this.f22237attabal = Collections.EMPTY_MAP;
    }
}
