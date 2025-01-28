package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {
    /**
     * No instances of this case should be available.
     */
    private ValidationUtil() {
    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5) errorResponse += "Ο τηλ. Αριθμός πρέπει να έχει περισσότερα από πέντε σύμβολα\n";
        if (insertDTO.getFirstname().length() < 2) errorResponse += "To όνομα πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";
        if (insertDTO.getLastname().length() < 2) errorResponse += "To επώνυμο πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5) errorResponse += "Ο τηλ. Αριθμός πρέπει να έχει περισσότερα από πέντε σύμβολα.\n";
        if (insertDTO.getFirstname().length() < 2) errorResponse += "To όνομα πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";
        if (insertDTO.getLastname().length() < 2) errorResponse += "To επώνυμο πρέπει να περιέχει δύο ή περισσότερους χαρακτήρες.\n";

        return errorResponse;
    }
}
