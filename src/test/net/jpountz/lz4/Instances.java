package net.jpountz.lz4;

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


enum Instances {
  ;

  static LZ4Compressor[] COMPRESSORS = new LZ4Compressor[] {
    LZ4Factory.nativeInstance().fastCompressor(),
    LZ4Factory.nativeInstance().highCompressor(),
    LZ4Factory.unsafeInstance().fastCompressor(),
    LZ4Factory.unsafeInstance().highCompressor(),
    LZ4Factory.safeInstance().fastCompressor(),
    LZ4Factory.safeInstance().highCompressor()
  };

  static LZ4Decompressor[] UNCOMPRESSORS = new LZ4Decompressor[] {
    LZ4Factory.nativeInstance().decompressor(),
    LZ4Factory.unsafeInstance().decompressor(),
    LZ4Factory.safeInstance().decompressor()
  };

  static LZ4UnknownSizeDecompressor[] UNCOMPRESSORS2 = new LZ4UnknownSizeDecompressor[] {
    LZ4Factory.nativeInstance().unknownSizeDecompressor(),
    LZ4Factory.unsafeInstance().unknownSizeDecompressor(),
    LZ4Factory.safeInstance().unknownSizeDecompressor()
  };

}
