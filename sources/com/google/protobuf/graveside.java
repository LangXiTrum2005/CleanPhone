package com.google.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class graveside implements grimness {
    private static final preprohormone EMPTY_FACTORY = new attabal();
    private final preprohormone messageInfoFactory;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class attabal implements preprohormone {
        @Override // com.google.protobuf.preprohormone
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.preprohormone
        public rotuma messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class dern implements preprohormone {
        private preprohormone[] factories;

        public dern(preprohormone... preprohormoneVarArr) {
            this.factories = preprohormoneVarArr;
        }

        @Override // com.google.protobuf.preprohormone
        public boolean isSupported(Class<?> cls) {
            for (preprohormone preprohormoneVar : this.factories) {
                if (preprohormoneVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.preprohormone
        public rotuma messageInfoFor(Class<?> cls) {
            for (preprohormone preprohormoneVar : this.factories) {
                if (preprohormoneVar.isSupported(cls)) {
                    return preprohormoneVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static /* synthetic */ class saneness {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public graveside() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(rotuma rotumaVar) {
        return saneness.$SwitchMap$com$google$protobuf$ProtoSyntax[rotumaVar.getSyntax().ordinal()] != 1;
    }

    private static preprohormone getDefaultMessageInfoFactory() {
        return new dern(triweekly.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static preprohormone getDescriptorMessageInfoFactory() {
        try {
            return (preprohormone) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> seminary<T> newSchema(Class<T> cls, rotuma rotumaVar) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return allowExtensions(rotumaVar) ? cuirassed.newSchema(cls, rotumaVar, yemenite.lite(), polloi.lite(), saran.unknownFieldSetLiteSchema(), formularize.lite(), gintrap.lite()) : cuirassed.newSchema(cls, rotumaVar, yemenite.lite(), polloi.lite(), saran.unknownFieldSetLiteSchema(), null, gintrap.lite());
        }
        return allowExtensions(rotumaVar) ? cuirassed.newSchema(cls, rotumaVar, yemenite.full(), polloi.full(), saran.unknownFieldSetFullSchema(), formularize.full(), gintrap.full()) : cuirassed.newSchema(cls, rotumaVar, yemenite.full(), polloi.full(), saran.unknownFieldSetFullSchema(), null, gintrap.full());
    }

    @Override // com.google.protobuf.grimness
    public <T> seminary<T> createSchema(Class<T> cls) {
        saran.requireGeneratedMessage(cls);
        rotuma rotumaVarMessageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (rotumaVarMessageInfoFor.isMessageSetWireFormat()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? stratoscope.newSchema(saran.unknownFieldSetLiteSchema(), formularize.lite(), rotumaVarMessageInfoFor.getDefaultInstance()) : stratoscope.newSchema(saran.unknownFieldSetFullSchema(), formularize.full(), rotumaVarMessageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, rotumaVarMessageInfoFor);
    }

    private graveside(preprohormone preprohormoneVar) {
        this.messageInfoFactory = (preprohormone) Internal.checkNotNull(preprohormoneVar, "messageInfoFactory");
    }
}
