package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class TinkFipsUtil {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Logger f22052attabal = Logger.getLogger(TinkFipsUtil.class.getName());

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final AtomicBoolean f22053saneness = new AtomicBoolean(false);

    public enum AlgorithmFipsCompatibility {
        ALGORITHM_NOT_FIPS { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.1
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public boolean isCompatible() {
                return !TinkFipsUtil.dern();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.2
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public boolean isCompatible() {
                return !TinkFipsUtil.dern() || TinkFipsUtil.saneness();
            }
        };

        public abstract boolean isCompatible();
    }

    public static Boolean attabal() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f22052attabal.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean dern() {
        return lemberg.attabal.attabal() || f22053saneness.get();
    }

    public static boolean saneness() {
        return attabal().booleanValue();
    }
}
