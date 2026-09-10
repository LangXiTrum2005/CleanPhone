package p002kotlin.reflect.jvm.internal.impl.resolve.scopes;

import byname.marial;
import discontentedly.saneness;
import java.util.Collection;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;

/* JADX INFO: compiled from: ResolutionScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface impromptu {

    /* JADX INFO: compiled from: ResolutionScope.kt */
    public static final class attabal {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection attabal(impromptu impromptuVar, wireman wiremanVar, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i & 1) != 0) {
                wiremanVar = wireman.f31402kowloon;
            }
            if ((i & 2) != 0) {
                function1 = MemberScope.f31364attabal.attabal();
            }
            return impromptuVar.competently(wiremanVar, function1);
        }
    }

    Collection<apical> competently(wireman wiremanVar, Function1<? super marial, Boolean> function1);

    beachfront marial(marial marialVar, saneness sanenessVar);
}
