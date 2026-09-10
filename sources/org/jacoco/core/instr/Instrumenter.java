package org.jacoco.core.instr;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.jacoco.core.JaCoCo;
import org.jacoco.core.internal.ContentTypeDetector;
import org.jacoco.core.internal.InputStreams;
import org.jacoco.core.internal.Pack200Streams;
import org.jacoco.core.internal.data.CRC64;
import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.internal.instr.ClassInstrumenter;
import org.jacoco.core.internal.instr.InstrSupport;
import org.jacoco.core.internal.instr.ProbeArrayStrategyFactory;
import org.jacoco.core.internal.instr.SignatureRemover;
import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

/* JADX INFO: loaded from: classes5.dex */
public class Instrumenter {
    private final IExecutionDataAccessorGenerator accessorGenerator;
    private final SignatureRemover signatureRemover = new SignatureRemover();

    public Instrumenter(IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        this.accessorGenerator = iExecutionDataAccessorGenerator;
    }

    private void copy(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = read(inputStream, bArr, str);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    private static long crc(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    private int filterOrInstrument(InputStream inputStream, OutputStream outputStream, String str, String str2) throws IOException {
        if (this.signatureRemover.filterEntry(str2, inputStream, outputStream)) {
            return 0;
        }
        return instrumentAll(inputStream, outputStream, str + "@" + str2);
    }

    private byte[] instrument(byte[] bArr) {
        long jClassId = CRC64.classId(bArr);
        ClassReader classReaderClassReaderFor = InstrSupport.classReaderFor(bArr);
        ClassWriter classWriter = new ClassWriter(classReaderClassReaderFor, 0) { // from class: org.jacoco.core.instr.Instrumenter.1
            @Override // org.objectweb.asm.ClassWriter
            public String getCommonSuperClass(String str, String str2) {
                throw new IllegalStateException();
            }
        };
        classReaderClassReaderFor.accept(new ClassProbesAdapter(new ClassInstrumenter(ProbeArrayStrategyFactory.createFor(jClassId, classReaderClassReaderFor, this.accessorGenerator), classWriter), InstrSupport.needsFrames(InstrSupport.getMajorVersion(classReaderClassReaderFor))), 8);
        return classWriter.toByteArray();
    }

    private IOException instrumentError(String str, Exception exc) {
        IOException iOException = new IOException(String.format("Error while instrumenting %s with JaCoCo %s/%s.", str, JaCoCo.VERSION, JaCoCo.COMMITID_SHORT));
        iOException.initCause(exc);
        return iOException;
    }

    private int instrumentGzip(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            InputStream gZIPInputStream = new GZIPInputStream(inputStream);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            int iInstrumentAll = instrumentAll(gZIPInputStream, gZIPOutputStream, str);
            gZIPOutputStream.finish();
            return iInstrumentAll;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentPack200(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            InputStream inputStreamUnpack = Pack200Streams.unpack(inputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int iInstrumentAll = instrumentAll(inputStreamUnpack, byteArrayOutputStream, str);
            Pack200Streams.pack(byteArrayOutputStream.toByteArray(), outputStream);
            return iInstrumentAll;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int instrumentZip(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        int iFilterOrInstrument = 0;
        while (true) {
            ZipEntry zipEntryNextEntry = nextEntry(zipInputStream, str);
            if (zipEntryNextEntry == null) {
                zipOutputStream.finish();
                return iFilterOrInstrument;
            }
            String name = zipEntryNextEntry.getName();
            if (!this.signatureRemover.removeEntry(name)) {
                ZipEntry zipEntry = new ZipEntry(name);
                zipEntry.setMethod(zipEntryNextEntry.getMethod());
                int method = zipEntryNextEntry.getMethod();
                if (method == 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    iFilterOrInstrument += filterOrInstrument(zipInputStream, byteArrayOutputStream, str, name);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    zipEntry.setSize(byteArray.length);
                    zipEntry.setCompressedSize(byteArray.length);
                    zipEntry.setCrc(crc(byteArray));
                    zipOutputStream.putNextEntry(zipEntry);
                    zipOutputStream.write(byteArray);
                } else {
                    if (method != 8) {
                        throw new AssertionError(zipEntryNextEntry.getMethod());
                    }
                    zipOutputStream.putNextEntry(zipEntry);
                    iFilterOrInstrument += filterOrInstrument(zipInputStream, zipOutputStream, str, name);
                }
                zipOutputStream.closeEntry();
            }
        }
    }

    private ZipEntry nextEntry(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return zipInputStream.getNextEntry();
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    private int read(InputStream inputStream, byte[] bArr, String str) throws IOException {
        try {
            return inputStream.read(bArr);
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public int instrumentAll(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            ContentTypeDetector contentTypeDetector = new ContentTypeDetector(inputStream);
            int type = contentTypeDetector.getType();
            if (type == -889275714) {
                instrument(contentTypeDetector.getInputStream(), outputStream, str);
                return 1;
            }
            if (type == -889270259) {
                return instrumentPack200(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 529203200) {
                return instrumentGzip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            if (type == 1347093252) {
                return instrumentZip(contentTypeDetector.getInputStream(), outputStream, str);
            }
            copy(contentTypeDetector.getInputStream(), outputStream, str);
            return 0;
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public void setRemoveSignatures(boolean z) {
        this.signatureRemover.setActive(z);
    }

    public byte[] instrument(byte[] bArr, String str) throws IOException {
        try {
            return instrument(bArr);
        } catch (RuntimeException e) {
            throw instrumentError(str, e);
        }
    }

    public byte[] instrument(InputStream inputStream, String str) throws IOException {
        try {
            return instrument(InputStreams.readFully(inputStream), str);
        } catch (IOException e) {
            throw instrumentError(str, e);
        }
    }

    public void instrument(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        outputStream.write(instrument(inputStream, str));
    }
}
