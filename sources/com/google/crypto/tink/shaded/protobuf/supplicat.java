package com.google.crypto.tink.shaded.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class supplicat implements timberyard {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final saran f22315saneness = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saran f22316attabal;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class attabal implements saran {
        @Override // com.google.crypto.tink.shaded.protobuf.saran
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.saran
        public grimness messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class dern implements saran {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public saran[] f22317attabal;

        public dern(saran... saranVarArr) {
            this.f22317attabal = saranVarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.saran
        public boolean isSupported(Class<?> cls) {
            for (saran saranVar : this.f22317attabal) {
                if (saranVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.saran
        public grimness messageInfoFor(Class<?> cls) {
            for (saran saranVar : this.f22317attabal) {
                if (saranVar.isSupported(cls)) {
                    return saranVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f22318attabal;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            f22318attabal = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public supplicat() {
        this(saneness());
    }

    public static boolean attabal(grimness grimnessVar) {
        return saneness.f22318attabal[grimnessVar.getSyntax().ordinal()] != 1;
    }

    public static saran dern() {
        if (clubfoot.f22174wireman) {
            return f22315saneness;
        }
        try {
            return (saran) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return f22315saneness;
        }
    }

    public static boolean marial(Class<?> cls) {
        return clubfoot.f22174wireman || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    public static saran saneness() {
        return new dern(dovishness.attabal(), dern());
    }

    public static <T> premeiotic<T> wireman(Class<T> cls, grimness grimnessVar) {
        if (marial(cls)) {
            return hydrovane.seminary(cls, grimnessVar, splinterproof.saneness(), sealless.saneness(), milliradian.saran(), attabal(grimnessVar) ? polloi.saneness() : null, seminary.saneness());
        }
        peridotite peridotiteVarAttabal = splinterproof.attabal();
        arytenoidectomy<?> arytenoidectomyVarAttabal = null;
        oilcan oilcanVarAttabal = sealless.attabal();
        lerp<?, ?> lerpVarGrimness = milliradian.grimness();
        if (attabal(grimnessVar)) {
            arytenoidectomyVarAttabal = polloi.attabal();
        }
        return hydrovane.seminary(cls, grimnessVar, peridotiteVarAttabal, oilcanVarAttabal, lerpVarGrimness, arytenoidectomyVarAttabal, seminary.attabal());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.timberyard
    public <T> premeiotic<T> createSchema(Class<T> cls) {
        milliradian.merc(cls);
        grimness grimnessVarMessageInfoFor = this.f22316attabal.messageInfoFor(cls);
        if (grimnessVarMessageInfoFor.isMessageSetWireFormat()) {
            return marial(cls) ? walach.beachfront(milliradian.saran(), polloi.saneness(), grimnessVarMessageInfoFor.getDefaultInstance()) : walach.beachfront(milliradian.grimness(), polloi.attabal(), grimnessVarMessageInfoFor.getDefaultInstance());
        }
        return wireman(cls, grimnessVarMessageInfoFor);
    }

    public supplicat(saran saranVar) {
        this.f22316attabal = (saran) rotuma.saneness(saranVar, "messageInfoFactory");
    }
}
