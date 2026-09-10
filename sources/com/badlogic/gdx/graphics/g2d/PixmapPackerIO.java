package com.badlogic.gdx.graphics.g2d;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.PixmapIO;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectMap;
import java.io.Writer;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public class PixmapPackerIO {

    /* JADX INFO: renamed from: com.badlogic.gdx.graphics.g2d.PixmapPackerIO$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$badlogic$gdx$graphics$g2d$PixmapPackerIO$ImageFormat;

        static {
            int[] iArr = new int[ImageFormat.values().length];
            $SwitchMap$com$badlogic$gdx$graphics$g2d$PixmapPackerIO$ImageFormat = iArr;
            try {
                iArr[ImageFormat.CIM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$badlogic$gdx$graphics$g2d$PixmapPackerIO$ImageFormat[ImageFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum ImageFormat {
        CIM(".cim"),
        PNG(".png");

        private final String extension;

        ImageFormat(String str) {
            this.extension = str;
        }

        public String getExtension() {
            return this.extension;
        }
    }

    public static class SaveParameters {
        public ImageFormat format = ImageFormat.PNG;
        public Texture.TextureFilter magFilter;
        public Texture.TextureFilter minFilter;
        public boolean useIndexes;

        public SaveParameters() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Nearest;
            this.minFilter = textureFilter;
            this.magFilter = textureFilter;
        }
    }

    public void save(FileHandle fileHandle, PixmapPacker pixmapPacker) throws Throwable {
        save(fileHandle, pixmapPacker, new SaveParameters());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0122  */
    /* JADX WARN: Code duplicated, block: B:27:0x0204  */
    public void save(FileHandle fileHandle, PixmapPacker pixmapPacker, SaveParameters saveParameters) throws Throwable {
        int i;
        String strGroup;
        Writer writer = fileHandle.writer(false);
        Array.ArrayIterator<PixmapPacker.Page> it = pixmapPacker.pages.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            PixmapPacker.Page next = it.next();
            if (next.rects.size > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(fileHandle.nameWithoutExtension());
                sb.append("_");
                i2++;
                sb.append(i2);
                sb.append(saveParameters.format.getExtension());
                FileHandle fileHandleSibling = fileHandle.sibling(sb.toString());
                int i3 = AnonymousClass1.$SwitchMap$com$badlogic$gdx$graphics$g2d$PixmapPackerIO$ImageFormat[saveParameters.format.ordinal()];
                int i4 = 2;
                int i5 = 1;
                if (i3 == 1) {
                    PixmapIO.writeCIM(fileHandleSibling, next.image);
                } else if (i3 == 2) {
                    PixmapIO.writePNG(fileHandleSibling, next.image);
                }
                writer.write("\n");
                writer.write(fileHandleSibling.name() + "\n");
                writer.write("size: " + next.image.getWidth() + "," + next.image.getHeight() + "\n");
                StringBuilder sb2 = new StringBuilder("format: ");
                sb2.append(pixmapPacker.pageFormat.name());
                sb2.append("\n");
                writer.write(sb2.toString());
                writer.write("filter: " + saveParameters.minFilter.name() + "," + saveParameters.magFilter.name() + "\n");
                writer.write("repeat: none\n");
                ObjectMap.Keys<String> it2 = next.rects.keys().iterator();
                while (it2.hasNext()) {
                    String next2 = it2.next();
                    if (saveParameters.useIndexes) {
                        Matcher matcher = PixmapPacker.indexPattern.matcher(next2);
                        if (matcher.matches()) {
                            strGroup = matcher.group(i5);
                            i = Integer.parseInt(matcher.group(i4));
                        } else {
                            i = -1;
                            strGroup = next2;
                        }
                    } else {
                        i = -1;
                        strGroup = next2;
                    }
                    writer.write(strGroup + "\n");
                    PixmapPacker.PixmapPackerRectangle pixmapPackerRectangle = next.rects.get(next2);
                    writer.write("  rotate: false\n");
                    writer.write("  xy: " + ((int) pixmapPackerRectangle.x) + "," + ((int) pixmapPackerRectangle.y) + "\n");
                    writer.write("  size: " + ((int) pixmapPackerRectangle.width) + "," + ((int) pixmapPackerRectangle.height) + "\n");
                    if (pixmapPackerRectangle.splits != null) {
                        writer.write("  split: " + pixmapPackerRectangle.splits[0] + ", " + pixmapPackerRectangle.splits[1] + ", " + pixmapPackerRectangle.splits[2] + ", " + pixmapPackerRectangle.splits[3] + "\n");
                        if (pixmapPackerRectangle.pads != null) {
                            writer.write("  pad: " + pixmapPackerRectangle.pads[0] + ", " + pixmapPackerRectangle.pads[1] + ", " + pixmapPackerRectangle.pads[2] + ", " + pixmapPackerRectangle.pads[3] + "\n");
                        }
                    }
                    writer.write("  orig: " + pixmapPackerRectangle.originalWidth + ", " + pixmapPackerRectangle.originalHeight + "\n");
                    writer.write("  offset: " + pixmapPackerRectangle.offsetX + ", " + ((int) ((((float) pixmapPackerRectangle.originalHeight) - pixmapPackerRectangle.height) - ((float) pixmapPackerRectangle.offsetY))) + "\n");
                    StringBuilder sb3 = new StringBuilder("  index: ");
                    sb3.append(i);
                    sb3.append("\n");
                    writer.write(sb3.toString());
                    i4 = 2;
                    i5 = 1;
                }
            }
        }
        writer.close();
    }
}
