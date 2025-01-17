import type { Actions } from '../../../../../.svelte-kit/types/src/routes/(public)/login/$types';
import { SERVER_ROUTES } from '$lib/config/paths';
import { ApiService } from '$lib/utils/api.service';

export const actions: Actions = {
	default: async ({ request }) => {
		const data: FormData = await request.formData();
		const url: string = (new URL(SERVER_ROUTES.FORGOT_PASSWORD.path) + '?email=' + data.get('email')) as string;
		await ApiService.fetchFromServer(url, {
			method: 'POST',
			headers: { 'Content-Type': 'application/json' }
		});
	}
};
