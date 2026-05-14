function showConfirmationToast() {
    const toast = document.getElementById('confirmation-toast');
    toast.classList.remove('hidden');
}

function hideConfirmationToast() {
    const toast = document.getElementById('confirmation-toast');
    toast.classList.add('hidden');
}

function goBackHome() {
    alert('Returning to home');
    hideConfirmationToast();
}

function continueProcess() {
    alert('Continuing process');
    hideConfirmationToast();
}