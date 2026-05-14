function showErrorAlertToast() {
    const toast = document.getElementById('error-alert-toast');
    toast.classList.remove('hidden');
}

function closeErrorAlertToast() {
    const toast = document.getElementById('error-alert-toast');
    toast.classList.add('hidden');
}

function retryErrorAlert() {
    alert('Retrying operation...');
    closeErrorAlertToast();
}