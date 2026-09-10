package com.badlogic.gdx.files;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.StreamUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class FileHandle {
    protected File file;
    protected Files.FileType type;

    /* JADX INFO: renamed from: com.badlogic.gdx.files.FileHandle$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$Files$FileType;

        static {
            int[] iArr = new int[Files.FileType.values().length];
            $SwitchMap$com$badlogic$gdx$Files$FileType = iArr;
            try {
                iArr[Files.FileType.Internal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Files$FileType[Files.FileType.Classpath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Files$FileType[Files.FileType.Absolute.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$Files$FileType[Files.FileType.External.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FileHandle() {
    }

    private static void copyDirectory(FileHandle fileHandle, FileHandle fileHandle2) {
        fileHandle2.mkdirs();
        for (FileHandle fileHandle3 : fileHandle.list()) {
            FileHandle fileHandleChild = fileHandle2.child(fileHandle3.name());
            if (fileHandle3.isDirectory()) {
                copyDirectory(fileHandle3, fileHandleChild);
            } else {
                copyFile(fileHandle3, fileHandleChild);
            }
        }
    }

    private static void copyFile(FileHandle fileHandle, FileHandle fileHandle2) {
        try {
            fileHandle2.write(fileHandle.read(), false);
        } catch (Exception e) {
            throw new GdxRuntimeException("Error copying source file: " + fileHandle.file + " (" + fileHandle.type + ")\nTo destination: " + fileHandle2.file + " (" + fileHandle2.type + ")", e);
        }
    }

    private int estimateLength() {
        int length = (int) length();
        if (length != 0) {
            return length;
        }
        return 512;
    }

    public static FileHandle tempDirectory(String str) {
        try {
            File fileCreateTempFile = File.createTempFile(str, null);
            if (!fileCreateTempFile.delete()) {
                throw new IOException("Unable to delete temp file: " + fileCreateTempFile);
            }
            if (fileCreateTempFile.mkdir()) {
                return new FileHandle(fileCreateTempFile);
            }
            throw new IOException("Unable to create temp directory: " + fileCreateTempFile);
        } catch (IOException e) {
            throw new GdxRuntimeException("Unable to create temp file.", e);
        }
    }

    public static FileHandle tempFile(String str) {
        try {
            return new FileHandle(File.createTempFile(str, null));
        } catch (IOException e) {
            throw new GdxRuntimeException("Unable to create temp file.", e);
        }
    }

    public FileHandle child(String str) {
        return this.file.getPath().length() == 0 ? new FileHandle(new File(str), this.type) : new FileHandle(new File(this.file, str), this.type);
    }

    public void copyTo(FileHandle fileHandle) {
        if (!isDirectory()) {
            if (fileHandle.isDirectory()) {
                fileHandle = fileHandle.child(name());
            }
            copyFile(this, fileHandle);
            return;
        }
        if (!fileHandle.exists()) {
            fileHandle.mkdirs();
            if (!fileHandle.isDirectory()) {
                throw new GdxRuntimeException(AbstractC5044xl.k("Destination directory cannot be created: ", fileHandle));
            }
        } else if (!fileHandle.isDirectory()) {
            throw new GdxRuntimeException(AbstractC5044xl.k("Destination exists but is not a directory: ", fileHandle));
        }
        copyDirectory(this, fileHandle.child(name()));
    }

    public boolean delete() {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.file);
        }
        if (fileType != Files.FileType.Internal) {
            return file().delete();
        }
        throw new GdxRuntimeException("Cannot delete an internal file: " + this.file);
    }

    public boolean deleteDirectory() {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.file);
        }
        if (fileType != Files.FileType.Internal) {
            return deleteDirectory(file());
        }
        throw new GdxRuntimeException("Cannot delete an internal file: " + this.file);
    }

    public void emptyDirectory() {
        emptyDirectory(false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FileHandle)) {
            return false;
        }
        FileHandle fileHandle = (FileHandle) obj;
        return this.type == fileHandle.type && path().equals(fileHandle.path());
    }

    public boolean exists() {
        int i = AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType[this.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return file().exists();
            }
        } else if (file().exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(this.file.getPath().replace('\\', '/'));
        return FileHandle.class.getResource(sb.toString()) != null;
    }

    public String extension() {
        String name = this.file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? "" : name.substring(iLastIndexOf + 1);
    }

    public File file() {
        return this.type == Files.FileType.External ? new File(Gdx.files.getExternalStoragePath(), this.file.getPath()) : this.file;
    }

    public int hashCode() {
        return path().hashCode() + ((this.type.hashCode() + 37) * 67);
    }

    public boolean isDirectory() {
        if (this.type == Files.FileType.Classpath) {
            return false;
        }
        return file().isDirectory();
    }

    public long lastModified() {
        return file().lastModified();
    }

    public long length() {
        Files.FileType fileType = this.type;
        if (fileType != Files.FileType.Classpath && (fileType != Files.FileType.Internal || this.file.exists())) {
            return file().length();
        }
        InputStream inputStream = read();
        try {
            return inputStream.available();
        } catch (Exception unused) {
            return 0L;
        } finally {
            StreamUtils.closeQuietly(inputStream);
        }
    }

    public FileHandle[] list() {
        if (this.type == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot list a classpath directory: " + this.file);
        }
        String[] list = file().list();
        if (list == null) {
            return new FileHandle[0];
        }
        FileHandle[] fileHandleArr = new FileHandle[list.length];
        int length = list.length;
        for (int i = 0; i < length; i++) {
            fileHandleArr[i] = child(list[i]);
        }
        return fileHandleArr;
    }

    public ByteBuffer map() {
        return map(FileChannel.MapMode.READ_ONLY);
    }

    public void mkdirs() {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot mkdirs with a classpath file: " + this.file);
        }
        if (fileType != Files.FileType.Internal) {
            file().mkdirs();
        } else {
            throw new GdxRuntimeException("Cannot mkdirs with an internal file: " + this.file);
        }
    }

    public void moveTo(FileHandle fileHandle) {
        int i = AnonymousClass1.$SwitchMap$com$badlogic$gdx$Files$FileType[this.type.ordinal()];
        if (i == 1) {
            throw new GdxRuntimeException("Cannot move an internal file: " + this.file);
        }
        if (i == 2) {
            throw new GdxRuntimeException("Cannot move a classpath file: " + this.file);
        }
        if ((i == 3 || i == 4) && file().renameTo(fileHandle.file())) {
            return;
        }
        copyTo(fileHandle);
        delete();
        if (exists() && isDirectory()) {
            deleteDirectory();
        }
    }

    public String name() {
        return this.file.getName();
    }

    public String nameWithoutExtension() {
        String name = this.file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf == -1 ? name : name.substring(0, iLastIndexOf);
    }

    public FileHandle parent() {
        File parentFile = this.file.getParentFile();
        if (parentFile == null) {
            parentFile = this.type == Files.FileType.Absolute ? new File("/") : new File("");
        }
        return new FileHandle(parentFile, this.type);
    }

    public String path() {
        return this.file.getPath().replace('\\', '/');
    }

    public String pathWithoutExtension() {
        String strReplace = this.file.getPath().replace('\\', '/');
        int iLastIndexOf = strReplace.lastIndexOf(46);
        return iLastIndexOf == -1 ? strReplace : strReplace.substring(0, iLastIndexOf);
    }

    public InputStream read() {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath || ((fileType == Files.FileType.Internal && !file().exists()) || (this.type == Files.FileType.Local && !file().exists()))) {
            InputStream resourceAsStream = FileHandle.class.getResourceAsStream("/" + this.file.getPath().replace('\\', '/'));
            if (resourceAsStream != null) {
                return resourceAsStream;
            }
            throw new GdxRuntimeException("File not found: " + this.file + " (" + this.type + ")");
        }
        try {
            return new FileInputStream(file());
        } catch (Exception e) {
            if (file().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.file + " (" + this.type + ")", e);
            }
            throw new GdxRuntimeException("Error reading file: " + this.file + " (" + this.type + ")", e);
        }
    }

    public byte[] readBytes() {
        InputStream inputStream = read();
        try {
            try {
                byte[] bArrCopyStreamToByteArray = StreamUtils.copyStreamToByteArray(inputStream, estimateLength());
                StreamUtils.closeQuietly(inputStream);
                return bArrCopyStreamToByteArray;
            } catch (IOException e) {
                throw new GdxRuntimeException("Error reading file: " + this, e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    public String readString() {
        return readString(null);
    }

    public Reader reader() {
        return new InputStreamReader(read());
    }

    public FileHandle sibling(String str) {
        if (this.file.getPath().length() != 0) {
            return new FileHandle(new File(this.file.getParent(), str), this.type);
        }
        throw new GdxRuntimeException("Cannot get the sibling of the root.");
    }

    public String toString() {
        return this.file.getPath().replace('\\', '/');
    }

    public Files.FileType type() {
        return this.type;
    }

    public OutputStream write(boolean z) {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot write to a classpath file: " + this.file);
        }
        if (fileType == Files.FileType.Internal) {
            throw new GdxRuntimeException("Cannot write to an internal file: " + this.file);
        }
        parent().mkdirs();
        try {
            return new FileOutputStream(file(), z);
        } catch (Exception e) {
            if (file().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.file + " (" + this.type + ")", e);
            }
            throw new GdxRuntimeException("Error writing file: " + this.file + " (" + this.type + ")", e);
        }
    }

    public void writeBytes(byte[] bArr, boolean z) {
        OutputStream outputStreamWrite = write(z);
        try {
            try {
                outputStreamWrite.write(bArr);
                StreamUtils.closeQuietly(outputStreamWrite);
            } catch (IOException e) {
                throw new GdxRuntimeException("Error writing file: " + this.file + " (" + this.type + ")", e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(outputStreamWrite);
            throw th;
        }
    }

    public void writeString(String str, boolean z) {
        writeString(str, z, null);
    }

    public Writer writer(boolean z) {
        return writer(z, null);
    }

    public FileHandle(String str) {
        this.file = new File(str);
        this.type = Files.FileType.Absolute;
    }

    public void emptyDirectory(boolean z) {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot delete a classpath file: " + this.file);
        }
        if (fileType != Files.FileType.Internal) {
            emptyDirectory(file(), z);
        } else {
            throw new GdxRuntimeException("Cannot delete an internal file: " + this.file);
        }
    }

    public ByteBuffer map(FileChannel.MapMode mapMode) throws Throwable {
        if (this.type == Files.FileType.Classpath) {
            throw new GdxRuntimeException(AbstractC5044xl.k("Cannot map a classpath file: ", this));
        }
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                File file = file();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, mapMode == FileChannel.MapMode.READ_ONLY ? "r" : "rw");
                try {
                    MappedByteBuffer map = randomAccessFile2.getChannel().map(mapMode, 0L, file.length());
                    map.order(ByteOrder.nativeOrder());
                    StreamUtils.closeQuietly(randomAccessFile2);
                    return map;
                } catch (Exception e) {
                    e = e;
                    throw new GdxRuntimeException("Error memory mapping file: " + this + " (" + this.type + ")", e);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    StreamUtils.closeQuietly(randomAccessFile);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public String readString(String str) {
        StringBuilder sb = new StringBuilder(estimateLength());
        InputStreamReader inputStreamReader = null;
        try {
            try {
                inputStreamReader = str == null ? new InputStreamReader(read()) : new InputStreamReader(read(), str);
                char[] cArr = new char[256];
                while (true) {
                    int i = inputStreamReader.read(cArr);
                    if (i == -1) {
                        StreamUtils.closeQuietly(inputStreamReader);
                        return sb.toString();
                    }
                    sb.append(cArr, 0, i);
                }
            } catch (IOException e) {
                throw new GdxRuntimeException("Error reading layout file: " + this, e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(inputStreamReader);
            throw th;
        }
    }

    public Reader reader(String str) {
        InputStream inputStream = read();
        try {
            return new InputStreamReader(inputStream, str);
        } catch (UnsupportedEncodingException e) {
            StreamUtils.closeQuietly(inputStream);
            throw new GdxRuntimeException(AbstractC5044xl.k("Error reading file: ", this), e);
        }
    }

    public void writeString(String str, boolean z, String str2) {
        Writer writer = null;
        try {
            try {
                writer = writer(z, str2);
                writer.write(str);
                StreamUtils.closeQuietly(writer);
            } catch (Exception e) {
                throw new GdxRuntimeException("Error writing file: " + this.file + " (" + this.type + ")", e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(writer);
            throw th;
        }
    }

    public Writer writer(boolean z, String str) {
        Files.FileType fileType = this.type;
        if (fileType == Files.FileType.Classpath) {
            throw new GdxRuntimeException("Cannot write to a classpath file: " + this.file);
        }
        if (fileType == Files.FileType.Internal) {
            throw new GdxRuntimeException("Cannot write to an internal file: " + this.file);
        }
        parent().mkdirs();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file(), z);
            return str == null ? new OutputStreamWriter(fileOutputStream) : new OutputStreamWriter(fileOutputStream, str);
        } catch (IOException e) {
            if (file().isDirectory()) {
                throw new GdxRuntimeException("Cannot open a stream to a directory: " + this.file + " (" + this.type + ")", e);
            }
            throw new GdxRuntimeException("Error writing file: " + this.file + " (" + this.type + ")", e);
        }
    }

    public FileHandle(File file) {
        this.file = file;
        this.type = Files.FileType.Absolute;
    }

    private static boolean deleteDirectory(File file) {
        emptyDirectory(file, false);
        return file.delete();
    }

    private static void emptyDirectory(File file, boolean z) {
        File[] fileArrListFiles;
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        int length = fileArrListFiles.length;
        for (int i = 0; i < length; i++) {
            if (!fileArrListFiles[i].isDirectory()) {
                fileArrListFiles[i].delete();
            } else if (z) {
                emptyDirectory(fileArrListFiles[i], true);
            } else {
                deleteDirectory(fileArrListFiles[i]);
            }
        }
    }

    public int readBytes(byte[] bArr, int i, int i2) {
        InputStream inputStream = read();
        int i3 = 0;
        while (true) {
            try {
                try {
                    int i4 = inputStream.read(bArr, i + i3, i2 - i3);
                    if (i4 <= 0) {
                        StreamUtils.closeQuietly(inputStream);
                        return i3 - i;
                    }
                    i3 += i4;
                } catch (IOException e) {
                    throw new GdxRuntimeException("Error reading file: " + this, e);
                }
            } catch (Throwable th) {
                StreamUtils.closeQuietly(inputStream);
                throw th;
            }
        }
    }

    public void writeBytes(byte[] bArr, int i, int i2, boolean z) {
        OutputStream outputStreamWrite = write(z);
        try {
            try {
                outputStreamWrite.write(bArr, i, i2);
                StreamUtils.closeQuietly(outputStreamWrite);
            } catch (IOException e) {
                throw new GdxRuntimeException("Error writing file: " + this.file + " (" + this.type + ")", e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(outputStreamWrite);
            throw th;
        }
    }

    public FileHandle(String str, Files.FileType fileType) {
        this.type = fileType;
        this.file = new File(str);
    }

    public FileHandle[] list(FileFilter fileFilter) {
        if (this.type != Files.FileType.Classpath) {
            String[] list = file().list();
            if (list == null) {
                return new FileHandle[0];
            }
            FileHandle[] fileHandleArr = new FileHandle[list.length];
            int i = 0;
            for (String str : list) {
                FileHandle fileHandleChild = child(str);
                if (fileFilter.accept(fileHandleChild.file())) {
                    fileHandleArr[i] = fileHandleChild;
                    i++;
                }
            }
            if (i >= list.length) {
                return fileHandleArr;
            }
            FileHandle[] fileHandleArr2 = new FileHandle[i];
            System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
            return fileHandleArr2;
        }
        throw new GdxRuntimeException("Cannot list a classpath directory: " + this.file);
    }

    public BufferedInputStream read(int i) {
        return new BufferedInputStream(read(), i);
    }

    public OutputStream write(boolean z, int i) {
        return new BufferedOutputStream(write(z), i);
    }

    public FileHandle(File file, Files.FileType fileType) {
        this.file = file;
        this.type = fileType;
    }

    public void write(InputStream inputStream, boolean z) {
        OutputStream outputStreamWrite = null;
        try {
            try {
                outputStreamWrite = write(z);
                StreamUtils.copyStream(inputStream, outputStreamWrite);
                StreamUtils.closeQuietly(inputStream);
                StreamUtils.closeQuietly(outputStreamWrite);
            } catch (Exception e) {
                throw new GdxRuntimeException("Error stream writing to file: " + this.file + " (" + this.type + ")", e);
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(inputStream);
            StreamUtils.closeQuietly(outputStreamWrite);
            throw th;
        }
    }

    public BufferedReader reader(int i) {
        return new BufferedReader(new InputStreamReader(read()), i);
    }

    public BufferedReader reader(int i, String str) {
        try {
            return new BufferedReader(new InputStreamReader(read(), str), i);
        } catch (UnsupportedEncodingException e) {
            throw new GdxRuntimeException(AbstractC5044xl.k("Error reading file: ", this), e);
        }
    }

    public FileHandle[] list(FilenameFilter filenameFilter) {
        if (this.type != Files.FileType.Classpath) {
            File file = file();
            String[] list = file.list();
            if (list == null) {
                return new FileHandle[0];
            }
            FileHandle[] fileHandleArr = new FileHandle[list.length];
            int i = 0;
            for (String str : list) {
                if (filenameFilter.accept(file, str)) {
                    fileHandleArr[i] = child(str);
                    i++;
                }
            }
            if (i >= list.length) {
                return fileHandleArr;
            }
            FileHandle[] fileHandleArr2 = new FileHandle[i];
            System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
            return fileHandleArr2;
        }
        throw new GdxRuntimeException("Cannot list a classpath directory: " + this.file);
    }

    public FileHandle[] list(String str) {
        if (this.type != Files.FileType.Classpath) {
            String[] list = file().list();
            if (list == null) {
                return new FileHandle[0];
            }
            FileHandle[] fileHandleArr = new FileHandle[list.length];
            int i = 0;
            for (String str2 : list) {
                if (str2.endsWith(str)) {
                    fileHandleArr[i] = child(str2);
                    i++;
                }
            }
            if (i >= list.length) {
                return fileHandleArr;
            }
            FileHandle[] fileHandleArr2 = new FileHandle[i];
            System.arraycopy(fileHandleArr, 0, fileHandleArr2, 0, i);
            return fileHandleArr2;
        }
        throw new GdxRuntimeException("Cannot list a classpath directory: " + this.file);
    }
}
