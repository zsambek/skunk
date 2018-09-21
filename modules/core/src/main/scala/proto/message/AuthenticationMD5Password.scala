package skunk.proto.message

import scodec.codecs.bytes

/**
 * Specifies that an MD5-encrypted password is required.
 * @param salt The salt to use when encrypting the password.
 */
final case class AuthenticationMD5Password(salt: Array[Byte]) extends AuthenticationRequest

object AuthenticationMD5Password {
  final val Tagʹ = 5
  val decoderʹ = bytes(4).map(bs => AuthenticationMD5Password(bs.toArray))
}
