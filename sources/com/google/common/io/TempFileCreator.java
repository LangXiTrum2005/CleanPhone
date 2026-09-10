package com.google.common.io;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryFlag;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class TempFileCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TempFileCreator f20027a;

    public static final class JavaIoCreator extends TempFileCreator {
        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return File.createTempFile("FileBackedOutputStream", null, null);
        }
    }

    public static final class JavaNioCreator extends TempFileCreator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PermissionSupplier f20028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PermissionSupplier f20029c = null;

        public interface PermissionSupplier {
            FileAttribute get();
        }

        static {
            PermissionSupplier permissionSupplier;
            Set setSupportedFileAttributeViews = FileSystems.getDefault().supportedFileAttributeViews();
            if (setSupportedFileAttributeViews.contains("posix")) {
                final int i2 = 0;
                f20028b = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        switch (i2) {
                            case 0:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f20028b;
                                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f20028b;
                                throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
                        }
                    }
                };
                return;
            }
            if (!setSupportedFileAttributeViews.contains("acl")) {
                final int i3 = 1;
                f20028b = new PermissionSupplier() { // from class: com.google.common.io.b
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        switch (i3) {
                            case 0:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f20028b;
                                return PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rw-------"));
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f20028b;
                                throw new IOException("unrecognized FileSystem type " + FileSystems.getDefault());
                        }
                    }
                };
                return;
            }
            try {
                UserPrincipal userPrincipalLookupPrincipalByName = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName(b());
                AclEntry.Builder builderNewBuilder = AclEntry.newBuilder();
                AclEntryType unused = AclEntryType.ALLOW;
                final ImmutableList immutableListZ = ImmutableList.z(builderNewBuilder.setType(AclEntryType.ALLOW).setPrincipal(userPrincipalLookupPrincipalByName).setPermissions(EnumSet.allOf(a.g())).setFlags(AclEntryFlag.DIRECTORY_INHERIT, AclEntryFlag.FILE_INHERIT).build());
                final FileAttribute<ImmutableList<AclEntry>> fileAttribute = new FileAttribute<ImmutableList<AclEntry>>() { // from class: com.google.common.io.TempFileCreator.JavaNioCreator.1
                    @Override // java.nio.file.attribute.FileAttribute
                    public final String name() {
                        return "acl:acl";
                    }

                    @Override // java.nio.file.attribute.FileAttribute
                    public final ImmutableList<AclEntry> value() {
                        return immutableListZ;
                    }
                };
                final int i4 = 0;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.c
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        Object obj = fileAttribute;
                        switch (i4) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f20028b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f20028b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            } catch (IOException e2) {
                final int i5 = 1;
                permissionSupplier = new PermissionSupplier() { // from class: com.google.common.io.c
                    @Override // com.google.common.io.TempFileCreator.JavaNioCreator.PermissionSupplier
                    public final FileAttribute get() throws IOException {
                        Object obj = e2;
                        switch (i5) {
                            case 0:
                                FileAttribute fileAttribute2 = (FileAttribute) obj;
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier2 = TempFileCreator.JavaNioCreator.f20028b;
                                return fileAttribute2;
                            default:
                                TempFileCreator.JavaNioCreator.PermissionSupplier permissionSupplier3 = TempFileCreator.JavaNioCreator.f20028b;
                                throw new IOException("Could not find user", (IOException) obj);
                        }
                    }
                };
            }
            f20028b = permissionSupplier;
        }

        public static String b() {
            String property = System.getProperty("user.name");
            Objects.requireNonNull(property);
            try {
                Class<?> cls = Class.forName("java.lang.ProcessHandle");
                Class<?> cls2 = Class.forName("java.lang.ProcessHandle$Info");
                Class<?> cls3 = Class.forName("java.util.Optional");
                Method method = cls.getMethod("current", new Class[0]);
                Method method2 = cls.getMethod("info", new Class[0]);
                Object objInvoke = cls3.getMethod("orElse", Object.class).invoke(cls2.getMethod("user", new Class[0]).invoke(method2.invoke(method.invoke(null, new Object[0]), new Object[0]), new Object[0]), property);
                Objects.requireNonNull(objInvoke);
                return (String) objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException unused) {
                return property;
            } catch (InvocationTargetException e2) {
                Throwables.a(e2.getCause());
                return property;
            }
        }

        @Override // com.google.common.io.TempFileCreator
        public final File a() {
            return java.nio.file.Files.createTempFile(Paths.get(System.getProperty("java.io.tmpdir"), new String[0]), "FileBackedOutputStream", null, f20028b.get()).toFile();
        }
    }

    public static final class ThrowingCreator extends TempFileCreator {
        @Override // com.google.common.io.TempFileCreator
        public final File a() throws IOException {
            throw new IOException("Guava cannot securely create temporary files or directories under SDK versions before Jelly Bean. You can create one yourself, either in the insecure default directory or in a more secure directory, such as context.getCacheDir(). For more information, see the Javadoc for Files.createTempDir().");
        }
    }

    static {
        TempFileCreator throwingCreator;
        try {
            try {
                Class.forName("java.nio.file.Path");
                throwingCreator = new JavaNioCreator();
            } catch (ClassNotFoundException unused) {
                throwingCreator = new ThrowingCreator();
            } catch (IllegalAccessException unused2) {
                throwingCreator = new ThrowingCreator();
            } catch (NoSuchFieldException unused3) {
                throwingCreator = new ThrowingCreator();
            }
        } catch (ClassNotFoundException unused4) {
            throwingCreator = ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue() < ((Integer) Class.forName("android.os.Build$VERSION_CODES").getField("JELLY_BEAN").get(null)).intValue() ? new ThrowingCreator() : new JavaIoCreator();
        }
        f20027a = throwingCreator;
    }

    public abstract File a();
}
