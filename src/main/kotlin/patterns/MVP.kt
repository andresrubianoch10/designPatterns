package patterns

data class NewForm(
    val form: String,
    val description: String
)

/**
 * In terms of View in Android, this interface could be implemented by a Fragment/Activity.
 */
interface NewFormView {
    fun displayNewsForm(newForm: NewForm)
}

class NewFormPresenter(
    private var newForm: NewForm,
    private var newFormView: NewFormView
) {
    fun updateView() {
        newFormView.displayNewsForm(newForm)
    }

    fun setNewForm(form: String) {
        newForm = newForm.copy(form = form)
    }

    fun setNewDescription(desc: String) {
        newForm = newForm.copy(description = desc)
    }
}
