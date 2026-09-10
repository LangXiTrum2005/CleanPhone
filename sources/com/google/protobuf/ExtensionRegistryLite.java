package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class ExtensionRegistryLite {
    static final ExtensionRegistryLite EMPTY_REGISTRY_LITE = new ExtensionRegistryLite(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile ExtensionRegistryLite emptyRegistry;
    private final Map<h1, GeneratedMessageLite.GeneratedExtension<?, ?>> extensionsByNumber;

    public ExtensionRegistryLite() {
        this.extensionsByNumber = new HashMap();
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite;
        if (!doFullRuntimeInheritanceCheck) {
            return EMPTY_REGISTRY_LITE;
        }
        ExtensionRegistryLite extensionRegistryLite2 = emptyRegistry;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = emptyRegistry;
                if (extensionRegistryLite == null) {
                    Class cls = f1.f24830a;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : EMPTY_REGISTRY_LITE;
                    emptyRegistry = extensionRegistryLite;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return extensionRegistryLite;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static ExtensionRegistryLite newInstance() {
        if (!doFullRuntimeInheritanceCheck) {
            return new ExtensionRegistryLite();
        }
        Class cls = f1.f24830a;
        ExtensionRegistryLite extensionRegistryLite = null;
        if (cls != null) {
            try {
                extensionRegistryLite = (ExtensionRegistryLite) cls.getDeclaredMethod("newInstance", null).invoke(null, null);
            } catch (Exception unused) {
            }
        }
        return extensionRegistryLite != null ? extensionRegistryLite : new ExtensionRegistryLite();
    }

    public static void setEagerlyParseMessageSets(boolean z10) {
        eagerlyParseMessageSets = z10;
    }

    public final void add(GeneratedMessageLite.GeneratedExtension<?, ?> generatedExtension) {
        this.extensionsByNumber.put(new h1(generatedExtension.getNumber(), generatedExtension.getContainingTypeDefaultInstance()), generatedExtension);
    }

    public <ContainingType extends MessageLite> GeneratedMessageLite.GeneratedExtension<ContainingType, ?> findLiteExtensionByNumber(ContainingType containingtype, int i10) {
        return (GeneratedMessageLite.GeneratedExtension) this.extensionsByNumber.get(new h1(i10, containingtype));
    }

    public ExtensionRegistryLite getUnmodifiable() {
        return new ExtensionRegistryLite(this);
    }

    public ExtensionRegistryLite(ExtensionRegistryLite extensionRegistryLite) {
        if (extensionRegistryLite == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.EMPTY_MAP;
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(extensionRegistryLite.extensionsByNumber);
        }
    }

    public final void add(ExtensionLite<?, ?> extensionLite) {
        Class cls;
        if (GeneratedMessageLite.GeneratedExtension.class.isAssignableFrom(extensionLite.getClass())) {
            add((GeneratedMessageLite.GeneratedExtension<?, ?>) extensionLite);
        }
        if (doFullRuntimeInheritanceCheck && (cls = f1.f24830a) != null && cls.isAssignableFrom(getClass())) {
            try {
                getClass().getMethod("add", g1.f24843a).invoke(this, extensionLite);
            } catch (Exception e10) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", extensionLite), e10);
            }
        }
    }

    public ExtensionRegistryLite(boolean z10) {
        this.extensionsByNumber = Collections.EMPTY_MAP;
    }
}
