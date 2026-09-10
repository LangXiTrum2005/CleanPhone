package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
final class ManifestSchemaFactory implements SchemaFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AnonymousClass1 f4872b = new AnonymousClass1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeMessageInfoFactory f4873a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static {
            try {
                new int[ProtoSyntax.values().length][1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MessageInfoFactory[] f4874a;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f4874a) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo messageInfoFor(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f4874a) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public ManifestSchemaFactory() {
        Protobuf protobuf = Protobuf.f4904c;
        MessageInfoFactory messageInfoFactory = f4872b;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.f4848a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.f4874a = messageInfoFactoryArr;
        Charset charset = Internal.f4857a;
        this.f4873a = compositeMessageInfoFactory;
    }
}
