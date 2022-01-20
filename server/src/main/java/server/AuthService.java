package server;

public interface AuthService {
    /**
     * Получение никнейма по логину и паролю.
     * Возвращает никнейм если учётная запись есть.
     * null если пары логин пароль не нашлось.
     */

    String getNicknameByLoginAndPassword(String login, String password);
}
