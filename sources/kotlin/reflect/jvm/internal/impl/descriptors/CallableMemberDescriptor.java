package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public interface CallableMemberDescriptor extends CallableDescriptor, MemberDescriptor {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Kind {
        public static final Kind X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Kind f43557Y;
        public static final Kind Z;
        public static final Kind e0;
        public static final /* synthetic */ Kind[] f0;

        static {
            Kind kind = new Kind("DECLARATION", 0);
            X = kind;
            Kind kind2 = new Kind("FAKE_OVERRIDE", 1);
            f43557Y = kind2;
            Kind kind3 = new Kind("DELEGATION", 2);
            Z = kind3;
            Kind kind4 = new Kind("SYNTHESIZED", 3);
            e0 = kind4;
            f0 = new Kind[]{kind, kind2, kind3, kind4};
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f0.clone();
        }
    }

    CallableMemberDescriptor C0(ClassDescriptor classDescriptor, Modality modality, DelegatedDescriptorVisibility delegatedDescriptorVisibility);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    CallableMemberDescriptor a();

    Kind getKind();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    Collection l();

    void x0(Collection collection);
}
