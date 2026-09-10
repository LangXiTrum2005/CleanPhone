package p002kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public interface CallableMemberDescriptor extends attabal, cord {

    public enum Kind {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    void achondroplasia(Collection<? extends CallableMemberDescriptor> collection2);

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    CallableMemberDescriptor attabal();

    Kind getKind();

    CallableMemberDescriptor merc(apical apicalVar, Modality modality, molybdenite molybdeniteVar, Kind kind, boolean z);

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    Collection<? extends CallableMemberDescriptor> wireman();
}
