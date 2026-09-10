package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.IOException;
import java.io.InputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInsPackageFragmentImpl extends DeserializedPackageFragmentImpl implements BuiltInsPackageFragment {

    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:20:0x0058  */
        public static BuiltInsPackageFragmentImpl a(FqName fqName, LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module, InputStream inputStream) throws IOException {
            ProtoBuf.PackageFragment packageFragment;
            MessageLite messageLite;
            Intrinsics.f(fqName, "fqName");
            Intrinsics.f(module, "module");
            try {
                BuiltInsBinaryVersion builtInsBinaryVersion = BuiltInsBinaryVersion.f;
                BuiltInsBinaryVersion builtInsBinaryVersionA = BuiltInsBinaryVersion.Companion.a(inputStream);
                BuiltInsBinaryVersion ourVersion = BuiltInsBinaryVersion.f;
                Intrinsics.f(ourVersion, "ourVersion");
                int i2 = builtInsBinaryVersionA.f44100c;
                int i3 = ourVersion.f44100c;
                int i4 = ourVersion.f44099b;
                int i5 = builtInsBinaryVersionA.f44099b;
                if (i5 == 0) {
                    if (i4 == 0 && i2 == i3) {
                        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
                        BuiltInsProtoBuf.a(extensionRegistryLite);
                        AbstractParser abstractParser = (AbstractParser) ProtoBuf.PackageFragment.l0;
                        abstractParser.getClass();
                        CodedInputStream codedInputStream = new CodedInputStream(inputStream);
                        messageLite = (MessageLite) abstractParser.a(codedInputStream, extensionRegistryLite);
                        try {
                            codedInputStream.a(0);
                            AbstractParser.b(messageLite);
                            packageFragment = (ProtoBuf.PackageFragment) messageLite;
                        } catch (InvalidProtocolBufferException e2) {
                            e2.X = messageLite;
                            throw e2;
                        }
                    } else {
                        packageFragment = null;
                    }
                } else if (i5 != i4 || i2 > i3) {
                    packageFragment = null;
                } else {
                    ExtensionRegistryLite extensionRegistryLite2 = new ExtensionRegistryLite();
                    BuiltInsProtoBuf.a(extensionRegistryLite2);
                    AbstractParser abstractParser2 = (AbstractParser) ProtoBuf.PackageFragment.l0;
                    abstractParser2.getClass();
                    CodedInputStream codedInputStream2 = new CodedInputStream(inputStream);
                    messageLite = (MessageLite) abstractParser2.a(codedInputStream2, extensionRegistryLite2);
                    codedInputStream2.a(0);
                    AbstractParser.b(messageLite);
                    packageFragment = (ProtoBuf.PackageFragment) messageLite;
                }
                ProtoBuf.PackageFragment packageFragment2 = packageFragment;
                inputStream.close();
                if (packageFragment2 != null) {
                    return new BuiltInsPackageFragmentImpl(fqName, lockBasedStorageManager, module, packageFragment2, builtInsBinaryVersionA);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + builtInsBinaryVersionA + ". Please update Kotlin");
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.a(inputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public final String toString() {
        return "builtins package fragment for " + this.f0 + " from " + DescriptorUtilsKt.j(this);
    }
}
