package com.google.common.base;

import com.google.common.base.internal.Finalizer;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class FinalizableReferenceQueue implements Closeable {
    public static final Logger X = Logger.getLogger(FinalizableReferenceQueue.class.getName());

    public static class DecoupledLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                return new URLClassLoader(new URL[]{b()}, null).loadClass("com.google.common.base.internal.Finalizer");
            } catch (Exception e2) {
                FinalizableReferenceQueue.X.log(Level.WARNING, "Could not load Finalizer in its own class loader. Loading Finalizer in the current class loader instead. As a result, you will not be able to garbage collect this class loader. To support reclaiming this class loader, either resolve the underlying issue, or move Guava to your system class path.", (Throwable) e2);
                return null;
            }
        }

        public final URL b() throws IOException {
            String str = "com.google.common.base.internal.Finalizer".replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class";
            URL resource = getClass().getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            }
            String string = resource.toString();
            if (string.endsWith(str)) {
                return new URL(resource, string.substring(0, string.length() - str.length()));
            }
            throw new IOException("Unsupported path style: ".concat(string));
        }
    }

    public static class DirectLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                Logger logger = Finalizer.X;
                return Finalizer.class;
            } catch (ClassNotFoundException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public interface FinalizerLoader {
        Class a();
    }

    public static class SystemLoader implements FinalizerLoader {
        @Override // com.google.common.base.FinalizableReferenceQueue.FinalizerLoader
        public final Class a() {
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader == null) {
                    return null;
                }
                try {
                    return systemClassLoader.loadClass("com.google.common.base.internal.Finalizer");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            } catch (SecurityException unused2) {
                FinalizableReferenceQueue.X.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    static {
        FinalizerLoader[] finalizerLoaderArr = {new SystemLoader(), new DecoupledLoader(), new DirectLoader()};
        for (int i2 = 0; i2 < 3; i2++) {
            Class clsA = finalizerLoaderArr[i2].a();
            if (clsA != null) {
                try {
                    clsA.getMethod("startFinalizer", Class.class, ReferenceQueue.class, PhantomReference.class);
                    return;
                } catch (NoSuchMethodException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        throw new AssertionError();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }
}
