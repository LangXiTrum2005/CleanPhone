package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: compiled from: ManifestSchemaFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class kattegat implements timberyard {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final grimness f9778saneness = new attabal();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final grimness f9779attabal;

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public class attabal implements grimness {
        @Override // androidx.datastore.preferences.protobuf.grimness
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.grimness
        public seminary messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static class dern implements grimness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public grimness[] f9780attabal;

        public dern(grimness... grimnessVarArr) {
            this.f9780attabal = grimnessVarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.grimness
        public boolean isSupported(Class<?> cls) {
            for (grimness grimnessVar : this.f9780attabal) {
                if (grimnessVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.grimness
        public seminary messageInfoFor(Class<?> cls) {
            for (grimness grimnessVar : this.f9780attabal) {
                if (grimnessVar.isSupported(cls)) {
                    return grimnessVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    /* JADX INFO: compiled from: ManifestSchemaFactory.java */
    public static /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f9781attabal;

        static {
            int[] iArr = new int[ProtoSyntax.values().length];
            f9781attabal = iArr;
            try {
                iArr[ProtoSyntax.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public kattegat() {
        this(saneness());
    }

    public static boolean attabal(seminary seminaryVar) {
        return saneness.f9781attabal[seminaryVar.getSyntax().ordinal()] != 1;
    }

    public static grimness dern() {
        if (clubfoot.f9694wireman) {
            return f9778saneness;
        }
        try {
            return (grimness) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            return f9778saneness;
        }
    }

    public static boolean marial(Class<?> cls) {
        return clubfoot.f9694wireman || GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    public static grimness saneness() {
        return new dern(adultoid.attabal(), dern());
    }

    public static <T> premeiotic<T> wireman(Class<T> cls, seminary seminaryVar) {
        if (marial(cls)) {
            return starveling.supplicat(cls, seminaryVar, mathsort.saneness(), yemenite.saneness(), milliradian.seminary(), attabal(seminaryVar) ? monoploid.saneness() : null, polder.saneness());
        }
        walach walachVarAttabal = mathsort.attabal();
        kowloon<?> kowloonVarAttabal = null;
        trm trmVarAttabal = yemenite.attabal();
        lerp<?, ?> lerpVarPolder = milliradian.polder();
        if (attabal(seminaryVar)) {
            kowloonVarAttabal = monoploid.attabal();
        }
        return starveling.supplicat(cls, seminaryVar, walachVarAttabal, trmVarAttabal, lerpVarPolder, kowloonVarAttabal, polder.attabal());
    }

    @Override // androidx.datastore.preferences.protobuf.timberyard
    public <T> premeiotic<T> createSchema(Class<T> cls) {
        milliradian.supplicat(cls);
        seminary seminaryVarMessageInfoFor = this.f9779attabal.messageInfoFor(cls);
        if (seminaryVarMessageInfoFor.isMessageSetWireFormat()) {
            return marial(cls) ? hydrovane.marial(milliradian.seminary(), monoploid.saneness(), seminaryVarMessageInfoFor.getDefaultInstance()) : hydrovane.marial(milliradian.polder(), monoploid.attabal(), seminaryVarMessageInfoFor.getDefaultInstance());
        }
        return wireman(cls, seminaryVarMessageInfoFor);
    }

    public kattegat(grimness grimnessVar) {
        this.f9779attabal = (grimness) gintrap.saneness(grimnessVar, "messageInfoFactory");
    }
}
